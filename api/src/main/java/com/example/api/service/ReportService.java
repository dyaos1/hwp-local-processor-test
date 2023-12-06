package com.example.api.service;

import com.example.api.constant.ReportType;
import com.example.api.dto.ReportDto;
import com.example.api.entity.Report;
import com.example.api.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReportService {
    private final ReportRepository reportRepository;

    public Report saveReportDto(ReportDto reportDto) {
        Report report = new Report();
        report.setTitle(reportDto.title());
        if(reportDto.reportType().toUpperCase() == "A") {
            report.setReportType(ReportType.A);
        } else if (reportDto.reportType().toUpperCase() == "B") {
            report.setReportType(ReportType.B);
        }

        Report savedReport = reportRepository.save(report);
        return savedReport;
    }

    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }

    public List<Report> reportsList() {
        List<Report> reports = reportRepository.findAll();
        return reports;
    }
}
