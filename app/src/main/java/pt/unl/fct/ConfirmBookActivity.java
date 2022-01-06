package pt.unl.fct;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ConfirmBookActivity extends AppCompatActivity {
    private String date, time, tableNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_booking_layout);

        Intent intent = getIntent();
        if (intent != null) {
            date = intent.getStringExtra("date");
            time = intent.getStringExtra("time");
            tableNumber = intent.getStringExtra("tableNumber");

            TextView dateView = findViewById(R.id.date);
            dateView.setText(date);
            TextView timeView = findViewById(R.id.time);
            timeView.setText(time);
            TextView tableNumberView = findViewById(R.id.tableNumber);
            tableNumberView.setText(tableNumber);

        }


        Button finishButton = findViewById(R.id.confirmBooking);
        finishButton.setOnClickListener(v -> {
            Toast.makeText(this, "Booking Confirmed", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, MainAppActivity.class));
        });

    }
}
