package com.inventorymanagement.model.ui;


import java.time.LocalDateTime;

public class SupplierDto {

    private int id;

    private String name;

    private String address;

    private LocalDateTime createdOn;

    private String email;

    public SupplierDto() {

    }

    private SupplierDto(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setAddress(builder.address);
        setCreatedOn(builder.createdOn);
        setEmail(builder.email);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final class Builder {
        private int id;
        private String name;
        private String address;
        private LocalDateTime createdOn;
        private String email;

        private Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder createdOn(LocalDateTime val) {
            createdOn = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public SupplierDto build() {
            return new SupplierDto(this);
        }
    }
}
