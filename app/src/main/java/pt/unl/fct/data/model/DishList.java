package pt.unl.fct.data.model;

import java.util.ArrayList;
import java.util.List;

import pt.unl.fct.R;

public class DishList {
    private final List<Dish> list;

    public DishList() {
        this.list = new ArrayList<>();
        list.add(new Dish("Kebab","Good fud ye", 2.00, R.drawable.h3));
        list.add(new Dish("pizza","Good fud ye", 10.00, R.drawable.divina_gula));
        list.add(new Dish("Burger","Good fud ye", 5.00, R.drawable.h3));
        list.add(new Dish("Canelones","Good fud ye", 8.00, R.drawable.h3));
    }

    public List<Dish> getList() {
        return list;
    }
}
