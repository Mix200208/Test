package com.example.test

import Socket.Client
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val button: Button = findViewById(R.id.buttonLogin)
        button.setOnClickListener { clickLoginButton() }
    }

    fun clickLoginButton(){
        // context, 3 переменная - длительность отображения
        val userName: EditText = findViewById(R.id.UserName)
        val client : Client = Client()
        client.sendData(userName.toString())
        val mes = Intent(this,MainTestActivity::class.java)
        mes.putExtra(MainTestActivity.USER_NAME, userName.toString())
        startActivity(mes)
    }



    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
        }
}
