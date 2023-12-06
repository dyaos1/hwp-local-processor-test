package com.example.api.controller;

import com.example.api.entity.Report;
import com.example.api.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping("/reports")
    List<Report> reportsList() {
        List<Report> reports = reportService.reportsList();
        return reports;
    }

    @PostMapping("/reports")
    Report reportCreate(@RequestBody Report newReport) {
        return reportService.saveReport(newReport);
    }
}
