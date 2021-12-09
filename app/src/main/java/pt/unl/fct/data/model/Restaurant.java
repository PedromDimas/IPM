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
}
