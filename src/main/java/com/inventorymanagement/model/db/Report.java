package com.inventorymanagement.model.db;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "inventory_management", name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String supplierEmail;

    private String productName;

    private int quantity;

    private String sku;

    private LocalDateTime localDateTime;

    private int UpdatedQuantity;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getUpdatedQuantity() {
        return UpdatedQuantity;
    }

    public void setUpdatedQuantity(int updatedQuantity) {
        UpdatedQuantity = updatedQuantity;
    }
}
