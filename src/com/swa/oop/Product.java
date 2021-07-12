package com.swa.oop;

public class Product {
    private String productID;
    private String productName;

    Product(String p_id, String pName) {
        this.productID = p_id;
        this.productName = pName;
    }

    public String getDetail() {
        return "com.swa.oop.Product ID : " + this.productID + " and com.swa.oop.Product Name : " + this.productName;
    }
}
