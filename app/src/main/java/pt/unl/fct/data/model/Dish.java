package pt.unl.fct.data.model;

import java.io.Serializable;

public class Dish implements Serializable {
    private String name, description;
    private double price;
    int mainImage;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    int count;

    public Dish(String name, String description, double price, int mainImage){
        this.name = name;
        this.description = description;
        this.price = price;
        this.mainImage = mainImage;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public Dish(int mainImage) {
        this.mainImage = mainImage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }
}
