package com.yash.caproject.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yash.caproject.R
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val startBtn = findViewById<ImageView>(R.id.startbtn)

        startBtn.setOnClickListener {
            startActivity(Intent(this, Intro_activity::class.java))
        }
    }
}

