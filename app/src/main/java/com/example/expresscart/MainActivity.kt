package com.example.expresscart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val to_create = findViewById<Button>(R.id.create)
        to_create.setOnClickListener {
            val Intent = Intent(this, CreateAccount::class.java)
            startActivity(Intent)
        }

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            val login = Intent(this, bottom_navigation::class.java)
            startActivity(login)
        }
    }
}