package pt.unl.fct.data.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    int mainImage;
    String name, rating, price, description;
    double latitude, longitude;
    List<Integer> imagesIds;

    public Restaurant(int mainImage, String name, String rating, String price, String description, double latitude, double longitude) {
        this.mainImage = mainImage;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagesIds = new ArrayList<Integer>();
    }

    public Restaurant(int mainImage, String name, String rating, String price, String description, double latitude, double longitude, List<Integer> imagesIds) {
        this.mainImage = mainImage;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagesIds = imagesIds;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Integer> getImagesIds() {
        return imagesIds;
    }

    public void setImagesIds(List<Integer> imagesIds) {
        this.imagesIds = imagesIds;
    }
}
