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
class Intro_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ConstraintLayout>(R.id.btn1)
        val btn2 = findViewById<ConstraintLayout>(R.id.btn2)
        val btn3 = findViewById<ConstraintLayout>(R.id.btn3)
        val btn4 = findViewById<ConstraintLayout>(R.id.btn4)


        btn1.setOnClickListener {
            startActivity(Intent(this, CoursesListActivity::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, CoursesListActivity::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, CoursesListActivity::class.java))
        }
        btn4.setOnClickListener {
            startActivity(Intent(this, CoursesListActivity::class.java))
        }

    }
}