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

    public List<Integer> getImagesIds() {
        return imagesIds;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public void setImagesIds(List<Integer> imagesIds) {
        this.imagesIds = imagesIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(int restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getRestaurantPrice() {
        return restaurantPrice;
    }

    public void setRestaurantPrice(String restaurantPrice) {
        this.restaurantPrice = restaurantPrice;
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
}
