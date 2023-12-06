package com.example.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Entity
@Table(name = "performance_summary_table")
@Getter
@ToString
public class PerformanceSummaryTable extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    private String strategic_goal;

    @Setter
    private String performance_goal;

    @ManyToOne(optional = false)
    private Report report;

    public PerformanceSummaryTable() {
    }

    public PerformanceSummaryTable(String strategic_goal, String performance_goal, Report report) {
        this.strategic_goal = strategic_goal;
        this.performance_goal = performance_goal;
        this.report = report;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerformanceSummaryTable that = (PerformanceSummaryTable) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
