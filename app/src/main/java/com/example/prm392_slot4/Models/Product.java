package com.example.prm392_slot4.Models;

public class Product {
    private String name;
    private String category;
    private double price;
    private String imgUrl;

    public Product() {
    }

    public Product(String name, String category, double price, String imgUrl) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.imgUrl = imgUrl;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
