package com.example.dailytracker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class signin : AppCompatActivity() {


    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin2)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username:$username and Password:$password")


        }
        val secondActbutton = findViewById<Button>(R.id.login_btn)
        secondActbutton.setOnClickListener {

            val Intent = Intent(this, Home::class.java)
            startActivity(Intent)
        }
        val thirdActbutton = findViewById<Button>(R.id.register_btn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, signin::class.java)
            startActivity(Intent)

        }
    }
}