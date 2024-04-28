package com.example.android.fragaments.ui.main;

import android.os.Bundle;

public class Flower {
    public static final String FLOWER_NAME = "flower_Name";
    public static final String IMAGE_RESOURCE = "image_Resource";

    public static final String PRICE = "price";
    public static final String INSTRUCTIONS = "instructions";

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Flower(String flowerName, int imageResource, String instructions, double price) {
        this.flowerName = flowerName;
        this.imageResource = imageResource;
        this.instructions = instructions;
        this.price = price;
    }

    // create from a bundle
    public Flower(Bundle bundle){
        if (bundle != null) {
            this.flowerName =  bundle.getString(FLOWER_NAME);
            this.imageResource = bundle.getInt(IMAGE_RESOURCE);
            this.price = bundle.getDouble(PRICE);
            this.instructions = bundle.getString(INSTRUCTIONS);
        }
    }

    // Package ddata for transfer between activities
    public  Bundle toBundle(){
        Bundle bundle = new Bundle();
        bundle.putString(FLOWER_NAME , this.flowerName);
        bundle.putInt(IMAGE_RESOURCE , this.imageResource);
        bundle.putDouble(PRICE , this.price);
        bundle.putString(INSTRUCTIONS, this.instructions);
        return bundle;
    }
    private String flowerName;
    private int imageResource;
    private String instructions;
    private  double price;


}
