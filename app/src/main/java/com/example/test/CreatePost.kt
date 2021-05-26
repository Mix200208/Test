package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.test.Model.Post

class CreatePost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
    }

    fun SendPost(view: View){

        val data = findViewById<EditText>(R.id.post_data).text.toString();
        //val nick = findViewById<EditText>(R.id.textNameAccount).text.toString();


        ListPost.addPost(Post(ListPost.NickPhoto[Socket.username] ?: R.drawable.test4, Socket.username, data))

        val intent = Intent(this, ListPost::class.java)
        startActivity(intent)
    }
}