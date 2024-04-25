package com.example.tomagatchidogapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Welcome_Screen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        /*var imgWelcome = findViewById<ImageView>(R.id.imgWelcome)

        imgWelcome.setBackgroundResource(R.drawable.image_dogwelcomepage)*/
        var WelcomeButton =  findViewById<Button>(R.id.btnWelcome)

        WelcomeButton?.setOnClickListener {
            //creating an intent for the play screen page
            var intent = Intent(this, Play_Screen::class.java)
            //starting the activity
            startActivity(intent)
        }

    }
}