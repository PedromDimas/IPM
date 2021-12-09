package pt.unl.fct.data.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

import pt.unl.fct.R;

public class RestaurantListAdapter extends ArrayAdapter {

    public RestaurantListAdapter(Context context, ArrayList<Restaurant> userArrayList){

        super(context,R.layout.list_item_restaurant,userArrayList);

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

        restaurantImage.setImageResource(restaurant.restaurantImage);
        restaurantName.setText(restaurant.restaurantName);
        restaurantRating.setText(restaurant.restaurantRating);
        restaurantPrice.setText(restaurant.restaurantPrice);

//        return convertView;
        return super.getView(position, convertView, parent);
    }
}
