package com.example.tick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Attach Listeners
        this.attachButtonClickListeners()
    }

    private fun attachButtonClickListeners(){

        Handler().postDelayed({
            // Start your app's main activity
            startActivity(Intent(this, OnboardingStep1Activity::class.java))
            // Close the splash screen activity
            finish()
        }, 2000)
    }
}