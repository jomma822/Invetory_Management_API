package com.inventorymanagement.dao;


import com.inventorymanagement.model.db.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
    @Query("select p from Supplier p where p.name= ? or p.email= ?")
    Supplier findBySupplierNameAndEmail(final String supplierName, final String supplierEmail);
}
