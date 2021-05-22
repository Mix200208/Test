package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class ListPost : AppCompatActivity() {
    val names = mutableListOf<String>(
            "Ярык super.onCreate(savedInstanceState)        setContentView(R.layout.activity_list_post) super.onCreate(savedInstanceState)       setContentView(R.layout.activity_list_post)",
            "Danil",
            "Kostya",
            "Ярык",
            "Danil",
            "Kostya",
            "Ярык",
            "Danil",
            "Kostya",
            "Ярык",
            "Danil",
            "Kostya",
            "Ярык",
            "Danil",
            "Kostya",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_post)

        val listPost: ListView = findViewById(R.id.postNews)
        val adapter = ArrayAdapter<String>(this, R.layout.post_1,
                                           names)

        listPost.adapter = adapter
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