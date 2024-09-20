package com.example.e_com.Model;

public class FavoriteModel {
    private String productName;
    private String productModel;
    private String productPrice;
    private int productImage; // Drawable resource ID for product image

    public FavoriteModel(String productName, String productModel, String productPrice, int productImage) {
        this.productName = productName;
        this.productModel = productModel;
        this.productPrice = productPrice;
        this.productImage = productImage;
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

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
