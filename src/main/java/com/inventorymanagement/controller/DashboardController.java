package com.inventorymanagement.controller;

import com.inventorymanagement.dao.BrandDao;
import com.inventorymanagement.dao.ProductDao;
import com.inventorymanagement.dao.SupplierDao;
import com.inventorymanagement.dao.SupplierProductsDao;
import com.inventorymanagement.model.ui.DashboardStatsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @Autowired
    private BrandDao brandDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private SupplierProductsDao supplierProductsDao;

    @RequestMapping(value = "/stats", method = RequestMethod.GET)
    public ResponseEntity<?> overallStats(HttpServletRequest request, HttpServletResponse response) {

        long totalBrands = brandDao.findAll().stream().count();
        long totalProducts = productDao.findAll().stream().count();
        long totalSuppliers = supplierDao.findAll().stream().filter(supplier -> supplier.isActive()).count();
        long totalStockQuantity = supplierProductsDao.findAll().stream().map(supplierProducts -> supplierProducts.getQuantity())
                .mapToLong(quantity -> quantity).sum();

        double totalStockPrice = supplierProductsDao.findAll().stream().map(supplierProducts -> supplierProducts.getPrice()*supplierProducts.getQuantity())
                .mapToDouble(price -> price).sum();

        final DashboardStatsDto dashboardStatsDto = DashboardStatsDto.newBuilder()
                .totalBrands(totalBrands)
                .totalProducts(totalProducts)
                .totalSuppliers(totalSuppliers)
                .totalStockQuantity(totalStockQuantity)
                .totalStockPrice(totalStockPrice)
                .build();

        return ResponseEntity.ok(dashboardStatsDto);
    }
}
