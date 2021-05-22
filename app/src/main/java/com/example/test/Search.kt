package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val actionBar = supportActionBar
        actionBar!!.title = "Search"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}