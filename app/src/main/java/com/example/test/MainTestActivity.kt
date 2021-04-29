package com.example.test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main_test)
        val username: String? = intent.getStringExtra(USER_NAME)
        val userNameText : TextView = findViewById(R.id.textNameAccount)
        userNameText.text = username
    }

    companion object{
        const val USER_NAME = "username"
    }
}