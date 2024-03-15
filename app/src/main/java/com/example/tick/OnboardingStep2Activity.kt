package com.example.tick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingStep2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_step_2)

        this.attachButtonClickListeners()
    }

    private fun attachButtonClickListeners(){

        val button: Button = findViewById<Button>(R.id.btn_next)
        button.setOnClickListener {
            val intent = Intent(this, OnboardingStep3Activity::class.java)
            startActivity(intent)
        }
    }
}