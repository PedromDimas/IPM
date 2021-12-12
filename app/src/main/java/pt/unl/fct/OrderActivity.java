package pt.unl.fct;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import pt.unl.fct.data.model.DishList;
import pt.unl.fct.data.model.DishListAdapter;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ListView lv = findViewById(R.id.lvdishes);
        lv.setAdapter(new DishListAdapter(this,new DishList().getList()));

    }

}
