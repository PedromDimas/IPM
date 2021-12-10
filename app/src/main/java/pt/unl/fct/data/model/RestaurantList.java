package pt.unl.fct.data.model;

import java.util.ArrayList;
import java.util.List;

import pt.unl.fct.R;

public class RestaurantList {
    List<Restaurant> restaurantList;

    public RestaurantList(){
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.h3, "H3", "4.2", "8-12€", 38.6600191, -9.175006));
        restaurantList.add(new Restaurant(R.drawable.o_mercado,"O Mercado", "4.4", "2-5€", 38.6447408, -9.2373925));
        restaurantList.add(new Restaurant(R.drawable.rei_dos_menus,"Rei dos Menus", "3.9", "5-8€", 38.6593595, -9.201281));
        restaurantList.add(new Restaurant(R.drawable.serrado_futebol_clube,"Serrado Futebol Clube", "3.9", "6-10€", 38.6593268,-9.199704));
        restaurantList.add(new Restaurant(R.drawable.divina_gula,"Divina Gula", "4.4", "5-8€", 38.6592273,-9.1998533));
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
}
