package com.example.tomagatchidogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class Play_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_screen)

        //declaration of the buttons we will be using to manage our virtual pet
        var btnPlay = findViewById<Button>(R.id.btnPlay)
        var btnFeed = findViewById<Button>(R.id.btnFeed)
        var btnClean = findViewById<Button>(R.id.btnClean)

        //declaration of the image used to show the status of our virtual pet
        var imgOutput = findViewById<ImageView>(R.id.imgOutput)

        //declaration of the progress bars and the percentages showing all 3 current states of virtual pet
        var prgHappy = findViewById<ProgressBar>(R.id.prgHappiness)
        var prgClean = findViewById<ProgressBar>(R.id.prgClean)
        var prgHunger = findViewById<ProgressBar>(R.id.prgHunger)

        var txtHappy = findViewById<TextView>(R.id.txtHappy)
        var txtClean = findViewById<TextView>(R.id.txtClean)
        var txtHunger = findViewById<TextView>(R.id.txtHunger)

        //default values of the progress bars
        txtHunger.text = "${prgHunger.progress.toString()}%"
        txtHappy.text = "${prgHappy.progress.toString()}%"
        txtClean.text = "${prgClean.progress.toString()}%"

        //Functionality of the play button which results in the picture of the dog and the 3 progress bars changing to reflect that this
        btnPlay?.setOnClickListener {
            prgHunger.progress = prgHunger.progress + 6
            prgHappy.progress = prgHappy.progress + 9
            prgClean.progress = prgClean.progress - 8

            txtHunger.text = "${prgHunger.progress.toString()}%"
            txtHappy.text = "${prgHappy.progress.toString()}%"
            txtClean.text = "${prgClean.progress.toString()}%"

            imgOutput.setBackgroundResource(R.drawable.image_dogplaying)
        }

        //Functionality of the feed button which results in the picture of the dog and the 3 progress bars changing to reflect that this
        btnFeed?.setOnClickListener {
            prgHunger.progress = prgHunger.progress - 9
            prgHappy.progress = prgHappy.progress + 2
            prgClean.progress = prgClean.progress - 3

            txtHunger.text = "${prgHunger.progress.toString()}%"
            txtHappy.text = "${prgHappy.progress.toString()}%"
            txtClean.text = "${prgClean.progress.toString()}%"

            imgOutput.setBackgroundResource(R.drawable.image_dogeating)
        }

        //Functionality of the clean button which results in the picture of the dog and the 3 progress bars changing to reflect that this
        btnClean?.setOnClickListener {
            prgHunger.progress = prgHunger.progress + 5
            prgHappy.progress = prgHappy.progress - 7
            prgClean.progress = prgClean.progress + 9

            txtHunger.text = "${prgHunger.progress.toString()}%"
            txtHappy.text = "${prgHappy.progress.toString()}%"
            txtClean.text = "${prgClean.progress.toString()}%"

            imgOutput.setBackgroundResource(R.drawable.image_dogclean)
        }

    }
}