package com.example.teste02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: MainActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}