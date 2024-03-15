package com.example.tick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class SignUpStep3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_step_completed)

        this.attachButtonClickListeners()
    }

    private fun attachButtonClickListeners(){

        val button: ImageButton = findViewById<ImageButton>(R.id.btn_next)
        button.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Signed In Successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}