package pt.unl.fct;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button loginBtn = findViewById(R.id.btn_log_in);
        loginBtn.setOnClickListener(v -> {
            System.out.println("Going on a trip");
            startActivity(new Intent(this,MainAppActivity.class));
        });

        TextView btn=findViewById(R.id.txtview_create_acc);
        btn.setOnClickListener(v -> {
            startActivity(new Intent(this,RegisterActivity.class));
        });
    }
}