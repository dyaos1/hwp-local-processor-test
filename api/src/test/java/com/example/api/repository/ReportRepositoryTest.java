package com.example.api.repository;


import com.example.api.constant.ReportType;
import com.example.api.entity.Report;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class ReportRepositoryTest {
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
    @DisplayName("리포트 생성 테스트")
    public void createReportTest(){
        Report newReport = new Report();
        newReport.setTitle("테스트 리포트 1");
        newReport.setReportType(ReportType.A);
        Report savedReport = reportRepository.save(newReport);
        System.out.println(savedReport.toString());
    }

    @Test
    @DisplayName("타이틀 검색 테스트")
    public void findByTitleContainingTest() {

        createReports();

        List<Report> reports = reportRepository.findByTitleContainingOrderById("2");

        for(Report report: reports) {
            System.out.println(report.toString());
        }

        List<Report> reports2 = reportRepository.findByReportTypeOrderById(ReportType.A);

        for(Report report: reports2) {
            System.out.println(report.toString());
        }
    }
}
