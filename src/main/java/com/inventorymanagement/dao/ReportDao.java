package com.inventorymanagement.dao;

import com.inventorymanagement.model.db.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ReportDao extends JpaRepository<Report, Integer> {
}
