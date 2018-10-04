package com.sdoublet.homeshop.homeShop.homeshop2;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display a full description of the product
     */

    public void look(){

    }


    /**
     * add the product to a bill
     * @param bill the concened bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill, Integer quantity){
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
