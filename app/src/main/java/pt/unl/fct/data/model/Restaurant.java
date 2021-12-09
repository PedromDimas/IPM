package pt.unl.fct.data.model;

public class Restaurant {
    int restaurantImage;
    String restaurantName, restaurantRating, restaurantPrice;
    float latitude, longitude;

    public Restaurant(int restaurantImage, String restaurantName, String restaurantRating, String restaurantPrice, float latitude, float longitude) {
        this.restaurantImage = restaurantImage;
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantPrice = restaurantPrice;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
