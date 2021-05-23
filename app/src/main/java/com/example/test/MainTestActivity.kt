package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class MainTestActivity : AppCompatActivity() {
    lateinit var listAdapter: ListAdapter

    fun creat_news(){
        val username: String? = intent.getStringExtra(USER_NAME)
        val userNameText : TextView = findViewById(R.id.textNameAccount)
        userNameText.text = username
        val list = mutableListOf<ProfileData>()
        list.add(ProfileData(R.drawable.test1, "Kohli", "Best Batsman"))
        list.add(ProfileData(R.drawable.test1, "Amla", "Best Batsman of SA"))
        list.add(ProfileData(R.drawable.test1, "Bairstow", "Opener Batsman"))
        list.add(ProfileData(R.drawable.test1, "Bales", "Bales"))
        list.add(ProfileData(R.drawable.test1, "Shikhar Dhawan", "Indain Opener"))
        list.add(ProfileData(R.drawable.test1, "Hardik", "All Rounder"))
        list.add(ProfileData(R.drawable.test1, "Mahendra Singh Dhoni", "Former Indian Caption"))
        list.add(ProfileData(R.drawable.test1, "Indain Team", "Men in Blue"))

        listAdapter = ListAdapter(this, list)

        //val listView = findViewById<ListView>(R.id.listView)

        //listView.adapter = listAdapter
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main_test)
        creat_news()




    }

    companion object{
        const val USER_NAME = "username"
    }

    fun clickOnSearchButton(view: View) {
        val intent = Intent(this,Search::class.java)
        startActivity(intent)
    }

}