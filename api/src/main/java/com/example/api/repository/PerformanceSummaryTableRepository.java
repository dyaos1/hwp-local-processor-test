package com.example.api.repository;

import com.example.api.entity.PerformanceSummaryTable;
import com.example.api.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerformanceSummaryTableRepository extends JpaRepository<PerformanceSummaryTable, Long> {

}
