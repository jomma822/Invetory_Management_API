package com.inventorymanagement.dao;

import com.inventorymanagement.model.db.Brand;
import com.inventorymanagement.model.db.SupplierProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
public interface BrandDao extends JpaRepository<Brand, Integer> {
    @Query("select p from Brand p where p.name= ?1")
    Brand findByName(final String name);
}
