package pt.unl.fct;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import pt.unl.fct.data.model.Restaurant;
import pt.unl.fct.data.model.RestaurantList;

public class InfoWindow implements GoogleMap.InfoWindowAdapter {
    private Context context;
    private final View mWindow;

    public InfoWindow(Context context){
        this.context = context;
        this.mWindow = LayoutInflater.from(context).inflate(R.layout.list_item_restaurant, null);
    }

    private void setTextOnWindow(Marker marker, View view){

        RestaurantList restaurantList = new RestaurantList();

        String title = marker.getTitle();
        TextView tv = (TextView) view.findViewById(R.id.restaurantName);

        tv.setText(title);

        ImageView iv = view.findViewById(R.id.restaurantImage);

        for (Restaurant r : restaurantList.getRestaurantList()) {
            if (r.getName().equals(title)){
                iv.setImageResource(r.getMainImage());
            }
        }


    }

    @Nullable
    @Override
    public View getInfoContents(@NonNull Marker marker) {
        setTextOnWindow(marker,mWindow);
        return mWindow;
    }

    @Nullable
    @Override
    public View getInfoWindow(@NonNull Marker marker) {
        setTextOnWindow(marker,mWindow);
        return mWindow;
    }


}
