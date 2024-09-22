package com.example.e_com.Model;

public class TopProductModel {
    private String name;
    private String category;
    private String image;
    private String model;
    private double price;
    private String productId;
    private String description;

    // Empty constructor for Firestore
    public TopProductModel() {
    }

    // Constructor
    public TopProductModel(String name, String category, String image, String model, double price, String productId, String description) {
        this.name = name;
        this.category = category;
        this.image = image;
        this.model = model;
        this.price = price;
        this.productId = productId;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
