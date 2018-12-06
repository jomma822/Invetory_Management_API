package com.inventorymanagement.model.ui;

public class ProductCheckoutDTO {

    private int selectedSupplierProductId;

    private int quantity;

    private String sku;

    private String email;

    public ProductCheckoutDTO(){

    }

    private ProductCheckoutDTO(Builder builder) {
        setSelectedSupplierProductId(builder.selectedSupplierProductId);
        setQuantity(builder.quantity);
        setSku(builder.sku);
        setEmail(builder.email);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getSelectedSupplierProductId() {
        return selectedSupplierProductId;
    }

    public void setSelectedSupplierProductId(int selectedSupplierProductId) {
        this.selectedSupplierProductId = selectedSupplierProductId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final class Builder {
        private int selectedSupplierProductId;
        private int quantity;
        private String sku;
        private String email;

        private Builder() {
        }

        public Builder selectedSupplierProductId(int val) {
            selectedSupplierProductId = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder sku(String val) {
            sku = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public ProductCheckoutDTO build() {
            return new ProductCheckoutDTO(this);
        }
    }
}
