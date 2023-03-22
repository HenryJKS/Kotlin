package com.example.aplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val result = findViewById<TextView>(R.id.result)
        val bundle =  intent.extras
        if (bundle != null) {
            result.text = bundle.getString("res")
        } else {
            val btn = findViewById<Button>(R.id.signupbtn)
            btn.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                //intent.putExtras(bundle)
                startActivity(intent)
            }

        }




    }
}