package com.example.e_com.Model;

public class MainModelItem {

    String idItem;
    String imageItem;  // Change to String for URL
    String priceItem;
    String nameItem;
    String categoryItem;
    String modelItem;

    public MainModelItem() {}

    public MainModelItem(String idItem, String imageItem, String priceItem, String nameItem, String categoryItem, String modelItem) {
        this.idItem = idItem;
        this.imageItem = imageItem;
        this.priceItem = priceItem;
        this.nameItem = nameItem;
        this.categoryItem = categoryItem;
        this.modelItem = modelItem;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getImageItem() {
        return imageItem;
    }

    public void setImageItem(String imageItem) {
        this.imageItem = imageItem;
    }

    public String getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(String priceItem) {
        this.priceItem = priceItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(String categoryItem) {
        this.categoryItem = categoryItem;
    }

    public String getModelItem() {
        return modelItem;
    }

    public void setModelItem(String modelItem) {
        this.modelItem = modelItem;
    }
}
