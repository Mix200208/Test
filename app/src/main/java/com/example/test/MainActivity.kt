package com.example.test

import Socket.ClientK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        Socket.username = userName.text.toString();
        val executorService = Executors.newFixedThreadPool(1)
        val future : Future<String> = executorService.submit(ClientK(Socket.username))
        val kek = future.get()

        //Старт отдельного потока отправки данных через ClientK
        //Thread(ClientK(userName.text.toString())).start()

        val intent = Intent(this, ListPost::class.java)
        //intent.putExtra(MainTestActivity.USER_NAME, userName.text.toString())
        startActivity(intent)
    }


    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }


}