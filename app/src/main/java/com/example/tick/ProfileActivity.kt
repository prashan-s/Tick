package com.example.tick

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.tick.R.layout.activity_profile)

        attachButtonClickListeners()

    }

    private fun attachButtonClickListeners(){

        val btn_dash : View = findViewById<View>(com.example.tick.R.id.btn_home)
        btn_dash.setOnClickListener {
            overridePendingTransition(0,0)
            finishAfterTransition()
        }
    }


}