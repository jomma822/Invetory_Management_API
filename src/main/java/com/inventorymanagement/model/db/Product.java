package com.inventorymanagement.model.db;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(schema = "inventory_management", name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    private LocalDateTime createdOn;

    @Column(unique = true)
    private String sku;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SupplierProducts> supplierProducts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;


    }
}
