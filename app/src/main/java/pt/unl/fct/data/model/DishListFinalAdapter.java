package pt.unl.fct.data.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import pt.unl.fct.R;

public class DishListFinalAdapter extends ArrayAdapter<Dish> {



    public DishListFinalAdapter(Context context, List<Dish> dishArrayList){

        super(context, R.layout.list_item_dish_pay,dishArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Dish dish = (Dish) getItem(position);

        if (convertView == null) convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_dish_pay,parent,false);


        ImageView imageView = convertView.findViewById(R.id.dishImage);
        TextView dishName = convertView.findViewById(R.id.dishName);
        TextView dishDes = convertView.findViewById(R.id.dishDescription);
        TextView dishPrice = convertView.findViewById(R.id.dishPrice);
        TextView dishCountView = convertView.findViewById(R.id.dish_ammount);

        imageView.setImageResource(dish.getMainImage());
        dishName.setText(dish.getName());
        dishDes.setText(dish.getDescription());
        dishPrice.setText(String.valueOf(dish.getPrice()));
        dishCountView.setText(String.valueOf(dish.getCount()));

        return convertView;
    }
}
