package com.yash.caproject.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yash.caproject.Adaptor.CoursesAdapter
import com.yash.caproject.Domain.CourseDomain
import com.yash.caproject.R

class CoursesListActivity : AppCompatActivity() {
    private var recyclerViewCourse: RecyclerView? = null
    private var adapterCoursesList: CoursesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_list)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val items = ArrayList<CourseDomain>()
        items.add(CourseDomain("Advanced certification Program in AI", 169.0, "ic_1"))
        items.add(CourseDomain("Google Cloud Platform Architecture", 69.0, "ic_2"))
        items.add(CourseDomain("Fundamental of Java Programming", 150.0, "ic_3"))
        items.add(CourseDomain("Introduction to UI design history", 79.0, "ic_4"))
        items.add(CourseDomain("PG Program in Big Data Engineering", 49.0, "ic_5"))
        items.add(CourseDomain("Data Structure and Algorithm", 46.0, "ic_1"))
        items.add(CourseDomain("Prompt Engineering", 42.0, "ic_3"))
        items.add(CourseDomain("MySQL", 36.0, "ic_4"))
        items.add(CourseDomain("Advance Java", 80.0, "ic_5"))
        items.add(CourseDomain("NodeJs", 105.0, "ic_1"))


        recyclerViewCourse = findViewById(R.id.view)
        adapterCoursesList = CoursesAdapter(items)
        recyclerViewCourse?.adapter = adapterCoursesList
        recyclerViewCourse?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}