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
import java.util.concurrent.atomic.AtomicInteger;

import pt.unl.fct.R;

public class DishListAdapter extends ArrayAdapter<Dish> {



    public DishListAdapter(Context context, List<Dish> dishArrayList){

        super(context, R.layout.list_item_restaurant,dishArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Dish dish = (Dish) getItem(position);

        if (convertView == null) convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_dish,parent,false);


        ImageView imageView = convertView.findViewById(R.id.dishImage);
        TextView dishName = convertView.findViewById(R.id.dishName);
        TextView dishDes = convertView.findViewById(R.id.dishDescription);
        TextView dishPrice = convertView.findViewById(R.id.dishPrice);
        TextView dishCountView = convertView.findViewById(R.id.dish_ammount);

        Button addDish = convertView.findViewById(R.id.btn_add_dish);
        Button removeDish = convertView.findViewById(R.id.btn_remove_dish);

        addDish.setOnClickListener(v -> {
            dish.setCount(dish.getCount() + 1);
            dishCountView.setText(String.valueOf(dish.getCount()));
        });

        removeDish.setOnClickListener(v ->{
            if (dish.getCount() > 0) {
                dish.setCount(dish.getCount() - 1);
                dishCountView.setText(String.valueOf(dish.getCount()));
            }
        });

        imageView.setImageResource(dish.getMainImage());
        dishName.setText(dish.getName());
        dishDes.setText(dish.getDescription());
        dishPrice.setText(String.valueOf(dish.getPrice()));
        dishCountView.setText(String.valueOf(dish.getCount()));



        return convertView;
    }
}
