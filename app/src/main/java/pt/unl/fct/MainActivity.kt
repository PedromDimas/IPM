package pt.unl.fct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val btn1 = findViewById<TextView>(R.id.txtview_main_log_in)
        btn1.setOnClickListener { v: View? ->
            startActivity(
                Intent(this@MainActivity, LoginActivity::class.java)
            )
        }

        val btn2 = findViewById<TextView>(R.id.txtview_main_create_acc)
        btn2.setOnClickListener { v: View? ->
            startActivity(
                Intent(this@MainActivity, RegisterActivity::class.java)
            )
        }

    }
}

