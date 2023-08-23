package com.example.teste01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonMain?.setOnClickListener {
            // convertendo para Int o valor pego do editText
            val age : Int = Integer.parseInt(binding?.editTextMain?.text.toString())

            val myIntent = Intent(this, ResultActivity::class.java)
            myIntent.putExtra("returnAge", age)
            myIntent.putExtra("returnName", "Wendel")
            startActivity(myIntent)
        };
    }
}