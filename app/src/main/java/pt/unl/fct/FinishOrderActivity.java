package pt.unl.fct;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import pt.unl.fct.data.model.Dish;
import pt.unl.fct.data.model.DishList;
import pt.unl.fct.data.model.DishListAdapter;

public class FinishOrderActivity extends AppCompatActivity {
    private double total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_finish_order);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Dish> dl = (ArrayList<Dish>) args.getSerializable("ARRAYLIST");
        TextView tv = findViewById(R.id.textView2);

        List<Dish> finalDL = new ArrayList<>();
        for (Dish d: dl) {
            if (d.getCount() > 0){
                finalDL.add(d);
                total = total + d.getCount()*d.getPrice();
                tv.setText(String.valueOf(total));
            }
        }

        ListView lv = findViewById(R.id.dishListView);
        lv.setAdapter(new DishListAdapter(this,finalDL));
        //Set Content




        Button finishButton = findViewById(R.id.button);
        finishButton.setOnClickListener(v->{
            Toast.makeText(this,"Order Complete",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,MainAppActivity.class));
        });

    }
}
