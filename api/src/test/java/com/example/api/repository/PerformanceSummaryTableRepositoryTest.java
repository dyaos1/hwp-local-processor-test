package com.example.api.repository;

import com.example.api.constant.ReportType;
import com.example.api.entity.PerformanceSummaryTable;
import com.example.api.entity.Report;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class PerformanceSummaryTableRepositoryTest {
    @Autowired
    PerformanceSummaryTableRepository performanceSummaryTableRepository;

    @Autowired
    ReportRepository reportRepository;

    public void createReports() {
        for(int i=1; i<=10; i++) {
            Report report = new Report();
            report.setTitle("리포트 테스트"+i);
            if(i%2 == 1) {
                report.setReportType(ReportType.A);
            } else {
                report.setReportType(ReportType.B);
            }
            Report savedReport = reportRepository.save(report);
            System.out.println(savedReport.toString());
        }
    }

    @Test
    @DisplayName("성과목표 지표 총괄표 생성 테스트")
    public void creationTest() {
        createReports();
        Optional<Report> reports = reportRepository.findById(2L);
        if (reports.isPresent()) {
            Report report = reports.get();
            PerformanceSummaryTable performanceSummaryTable = new PerformanceSummaryTable(
                    "원전 안전 강화 및 기술 확보를 통한 안전한 전력공급 기반 확충 및 원전산업 수출 확대",
                    "R&O를 통한 원전 안전/해체 기술 확보 및 사업부 확대",
                    report
            );
            PerformanceSummaryTable savedTable = performanceSummaryTableRepository.save(performanceSummaryTable);
            System.out.println(savedTable.toString());
        } else {
            System.out.println("none was found");
        }


    }
}
