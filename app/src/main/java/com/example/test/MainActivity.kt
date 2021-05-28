package com.example.test

import Socket.ClientK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.concurrent.Executors
import java.util.concurrent.Future

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val button: Button = findViewById(R.id.Check1)
        button.setOnClickListener { clickLoginButton() }
    }

    fun clickLoginButton() {
        val userName: EditText = findViewById(R.id.UserName)
        Socket.username = userName.text.    toString();
//        val executorService = Executors.newFixedThreadPool(1)
//        val future : Future<String> = executorService.submit(ClientK(Socket.username))
//        val kek = future.get()
        if (ListPost.NickPhoto.contains(Socket.username)) {
            val intent = Intent(this, ListPost::class.java)
            startActivity(intent)
        }
        else {
            val toast = Toast.makeText(applicationContext, "Нет такого аккаунта!", Toast.LENGTH_SHORT)
            toast.show()
        }


    }


    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }


}