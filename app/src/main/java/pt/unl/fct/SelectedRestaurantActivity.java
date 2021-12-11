package pt.unl.fct;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import pt.unl.fct.data.model.Restaurant;

public class SelectedRestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_restaurant_layout);

        Intent intent = this.getIntent();
        if (intent != null) {
            Restaurant restaurant = new Restaurant(intent.getIntExtra("mainImage", 0), intent.getStringExtra("name"), intent.getStringExtra("rating"), intent.getStringExtra("price")
                    , intent.getStringExtra("description"), intent.getDoubleExtra("latitude", 0), intent.getDoubleExtra("longitude", 0));

            ImageView restaurantImage = findViewById(R.id.selectedRestaurantImage);
            TextView restaurantName = findViewById(R.id.selectedRestaurantName);
            TextView restaurantDescription = findViewById(R.id.selectedRestaurantDescription);
            TextView restaurantRating = findViewById(R.id.restaurantRating);
            TextView restaurantPrice = findViewById(R.id.restaurantPrice);

            restaurantImage.setImageResource(restaurant.getMainImage());
            restaurantName.setText(restaurant.getName());
            restaurantDescription.setText(restaurant.getDescription());
            restaurantRating.setText(restaurant.getRating());
            restaurantPrice.setText(restaurant.getPrice());
        }
    }
}
