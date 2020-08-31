package com.sp.version.dto;


public class ProductV2 {

    private String productName;
    private String Price;

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public ProductV2(String productName, String price) {
        this.productName = productName;
        Price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
