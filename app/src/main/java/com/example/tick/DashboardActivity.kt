package com.example.tick

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.tick.R.layout.activity_dashboard)

        attachButtonClickListeners()

    }

    private fun attachButtonClickListeners(){


        val button: View = findViewById<View>(com.example.tick.R.id.btn_next)
        val button1: View = findViewById<View>(com.example.tick.R.id.row_1)
        val button2: View = findViewById<View>(com.example.tick.R.id.row_2)
        val button3: View = findViewById<View>(com.example.tick.R.id.row_3)
        val button4: View = findViewById<View>(com.example.tick.R.id.row_4)
        val button5: View = findViewById<View>(com.example.tick.R.id.row_5)
        val button6: View = findViewById<View>(com.example.tick.R.id.row_6)

        button.setOnClickListener(this@DashboardActivity)
        button1.setOnClickListener(this@DashboardActivity)
        button2.setOnClickListener(this@DashboardActivity)
        button3.setOnClickListener(this@DashboardActivity)
        button4.setOnClickListener(this@DashboardActivity)
        button5.setOnClickListener(this@DashboardActivity)
        button6.setOnClickListener(this@DashboardActivity)

        val btn_profile : View = findViewById<View>(com.example.tick.R.id.btn_profile)
        btn_profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            overridePendingTransition(0,0)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        v?.setOnClickListener {
            val intent = Intent(this, DashboardDetailActivity::class.java)
            startActivity(intent)
        }
    }

}