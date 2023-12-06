package com.example.api.entity;

import com.example.api.constant.ReportType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name="report")
@ToString
public class Report extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private ReportType reportType;

    @OneToMany(mappedBy = "report", cascade = CascadeType.ALL)
    @ToString.Exclude
    private final Set<PerformanceSummaryTable> performanceSummaryTables = new LinkedHashSet<>();

    public Report() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(id, report.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
