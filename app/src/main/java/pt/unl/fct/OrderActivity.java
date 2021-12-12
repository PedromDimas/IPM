package pt.unl.fct;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

import pt.unl.fct.data.model.DishList;
import pt.unl.fct.data.model.DishListAdapter;
import pt.unl.fct.data.model.Restaurant;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        DishList dl = new DishList();
        ListView lv = findViewById(R.id.lvdishes);
        lv.setAdapter(new DishListAdapter(this,dl.getList()));

        Button btn_checkout = findViewById(R.id.Order);
        btn_checkout.setOnClickListener(v->{

            Intent intent = new Intent(this, FinishOrderActivity.class);

            Bundle args = new Bundle();
            args.putSerializable("ARRAYLIST",(Serializable)dl.getList());
            intent.putExtra("BUNDLE",args);

            startActivity(intent);

        });


    }

}
