package com.example.dailytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

lateinit var nameInput: EditText
lateinit var usernameInput: EditText
lateinit var passwordInput: EditText
lateinit var signupBtn:Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        nameInput = this.findViewById(R.id.name_input)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        signupBtn = findViewById(R.id.login_btn)

        signupBtn.setOnClickListener{
            val name= nameInput.text.toString()
            val username=usernameInput.text.toString()
            val password =passwordInput.text.toString()
            Log.i("Test Credentials", "Name:$name, Username:$username and Password:$password")



        }
        val secondActbutton = findViewById<Button>(R.id.register_btn)
        secondActbutton.setOnClickListener{

            val Intent = Intent(this, signin::class.java)
            startActivity(Intent)
        }
    }
}