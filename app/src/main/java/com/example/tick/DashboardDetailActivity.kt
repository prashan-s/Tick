package com.example.tick

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class DashboardDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.tick.R.layout.activity_dashboard_detail)

        this.attachButtonClickListeners()
    }


    private fun attachButtonClickListeners(){


        val buttonLec: View = findViewById<View>(com.example.tick.R.id.btn_lectures)
        val buttonTut: View = findViewById<View>(com.example.tick.R.id.btn_tutorials)
        val buttonPract: View = findViewById<View>(com.example.tick.R.id.btn_practicals)

        buttonLec.setOnClickListener {
            val intent = Intent(this, LectureInfoActivity::class.java)
            startActivity(intent)
        }

        buttonTut.setOnClickListener {
            val intent = Intent(this, TutorialInfoActivity::class.java)
            startActivity(intent)
        }

        buttonPract.setOnClickListener {
            val intent = Intent(this, PracticalInfoActivity::class.java)
            startActivity(intent)
        }
    }

}