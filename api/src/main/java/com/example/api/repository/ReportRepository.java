package com.example.api.repository;

import com.example.api.constant.ReportType;
import com.example.api.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByTitleContainingOrderById(String title);
    List<Report> findByReportTypeOrderById(ReportType reportType);
}
