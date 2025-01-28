package com.example.dailytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.Navigate)
        secondActbutton.setOnClickListener {
            val Intent = Intent( this,signin::class.java)
            startActivity(Intent)


        }


    }
}