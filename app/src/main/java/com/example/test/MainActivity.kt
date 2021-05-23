package com.example.test

import Socket.ClientK
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val button: Button = findViewById(R.id.Check1)
        button.setOnClickListener { clickLoginButton() }
    }

    fun clickLoginButton() {
        val userName: EditText = findViewById(R.id.UserName)

        //Отправка данных через ClientX
        //val client : Connection = Connection("10.0.2.2", 30333)
        //client.openConnection()
        //client.sendData(userName.text.toString())
        //client.closeConnection()

        //Старт отдельного потока отправки данных через ClientK
        //Thread(ClientK(userName.text.toString())).start()
        Thread(ClientK(userName.text.toString())).start()
        val intent = Intent(this,MainTestActivity::class.java)
        intent.putExtra(MainTestActivity.USER_NAME, userName.text.toString())
        startActivity(intent)
    }


    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }


}