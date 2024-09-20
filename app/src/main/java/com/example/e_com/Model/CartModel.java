package com.example.e_com.Model;

public class CartModel {
    private String productName;
    private String productModel;
    private int productImage;
    private double productPrice;

    public CartModel() {
    }

    public CartModel(String productName, String productModel, int productImage, double productPrice, int i) {
        this.productName = productName;
        this.productModel = productModel;
        this.productImage = productImage;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
