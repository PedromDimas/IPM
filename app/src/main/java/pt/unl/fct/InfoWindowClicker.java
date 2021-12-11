package pt.unl.fct;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import pt.unl.fct.data.model.Restaurant;
import pt.unl.fct.data.model.RestaurantList;

public class InfoWindowClicker implements GoogleMap.OnInfoWindowClickListener {
    private Context context;
    public InfoWindowClicker(Context context) {
        this.context = context;
    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {
        RestaurantList restaurantList = new RestaurantList();

        Intent intent = new Intent(context, SelectedRestaurantActivity.class);
        Restaurant restaurant = null;
        for (Restaurant r: restaurantList.getRestaurantList()) {
            if (r.getName().equals(marker.getTitle())){
                restaurant = r;
                break;
            }
        }


        intent.putExtra("mainImage", restaurant.getMainImage());
        intent.putExtra("name", restaurant.getName());
        intent.putExtra("rating", restaurant.getRating());
        intent.putExtra("price", restaurant.getPrice());
        intent.putExtra("latitude", restaurant.getLatitude());
        intent.putExtra("longitude", restaurant.getLongitude());
        //intent.putExtra("imagesIds", restaurant.getImagesIds().toArray());
        context.startActivity(intent);

    }
}
