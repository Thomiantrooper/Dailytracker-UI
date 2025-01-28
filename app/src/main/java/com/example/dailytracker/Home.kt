package com.example.dailytracker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val secondActbutton = findViewById<Button>(R.id.drop)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, profile::class.java)
            startActivity(Intent)
        }
    }
}
