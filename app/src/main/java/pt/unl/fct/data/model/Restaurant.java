package pt.unl.fct.data.model;

public class Restaurant {
    int restaurantImage;
    String restaurantName, restaurantRating, restaurantPrice;
    double latitude, longitude;

    public Restaurant(int restaurantImage, String restaurantName, String restaurantRating, String restaurantPrice, double latitude, double longitude) {
        this.restaurantImage = restaurantImage;
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantPrice = restaurantPrice;
        this.latitude = latitude;
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
