package com.example.tick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignUpStep1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_step_1)

        this.attachButtonClickListeners()
    }

    private fun attachButtonClickListeners(){

        val button: ImageButton = findViewById<ImageButton>(R.id.btn_next)
        button.setOnClickListener {
            val intent = Intent(this, SignUpStep2Activity::class.java)
            startActivity(intent)
        }
    }
}