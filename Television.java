package com.sdoublet.homeshop.homeShop.homeshop2;

public class Television extends Product {
    private int size;
    private String slabtype;


    public Television(String name, String description, double price, int size, String slabtype) {
        super(name, description, price);
        this.size = size;
        this.slabtype = slabtype;
    }

    public int getSize() {
        return size;
    }

    public String getSlabtype() {
        return slabtype;
    }
}
