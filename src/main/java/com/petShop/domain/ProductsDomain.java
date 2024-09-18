package com.petShop.domain;

public class ProductsDomain {
    private int productId;
    private String firstName;
    private String description;
    private double price;
    private String stocks;
    private String Suppliers;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getSuppliers() {
        return Suppliers;
    }

    public void setSuppliers(String suppliers) {
        Suppliers = suppliers;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}

