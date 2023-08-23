package com.example.teste01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste01.databinding.ActivityMainBinding
import com.example.teste01.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private var binding: ActivityResultBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val i = intent
        val age = i.getIntExtra("returnAge", 0);
        val name = i.getStringExtra("returnName");

        binding?.textViewResult?.text = age.toString()

        binding?.buttonResult?.setOnClickListener {

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}