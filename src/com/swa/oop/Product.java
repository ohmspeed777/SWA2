package com.swa.oop;

public class Product {
    private String productID;
    private String productName;

    Product(String p_id, String p_name) {
        this.productID = p_id;
        this.productName = p_name;
    }

    public String getDetailProduct() {
        return "com.swa.oop.Product ID : " + this.productID + " and com.swa.oop.Product Name : " + this.productName;
    }
}
