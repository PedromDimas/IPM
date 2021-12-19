package pt.unl.fct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView btn=findViewById(R.id.txtview_sign_in);
        btn.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
        });

        Button finish_registration_btn= findViewById(R.id.btn_register);
        finish_registration_btn.setOnClickListener(v->{
            Toast.makeText(this,"Registration succeeded!",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,LoginActivity.class));
        });
    }
}
