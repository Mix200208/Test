package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val actionBar = supportActionBar
        actionBar!!.title = "Search"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    fun clickOnSearchButton(view: View) {
        val intent = Intent(this,Search::class.java)
        startActivity(intent)
    }

    fun clickOnHomeButton(view: View) {
        val intent = Intent(this,MainTestActivity::class.java)
        startActivity(intent)
    }
}