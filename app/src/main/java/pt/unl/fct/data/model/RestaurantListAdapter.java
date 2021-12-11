package pt.unl.fct.data.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

import pt.unl.fct.R;

public class RestaurantListAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantListAdapter(FragmentActivity activity, ArrayList<Restaurant> userArrayList){

        super(activity,R.layout.list_item_restaurant,userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Restaurant restaurant = (Restaurant) getItem(position);

        if (convertView == null) convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_restaurant,parent,false);


        ImageView restaurantImage = convertView.findViewById(R.id.restaurantImage);
        TextView restaurantName = convertView.findViewById(R.id.restaurantName);
        TextView restaurantRating = convertView.findViewById(R.id.restaurantRating);
        TextView restaurantPrice = convertView.findViewById(R.id.restaurantPrice);

        restaurantImage.setImageResource(restaurant.mainImage);
        restaurantName.setText(restaurant.name);
        restaurantRating.setText(restaurant.rating);
        restaurantPrice.setText(restaurant.price);

        return convertView;
    }
}
