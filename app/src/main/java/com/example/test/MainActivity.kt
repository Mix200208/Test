package com.example.test

import Socket.ClientK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val userName: EditText = findViewById(R.id.UserName)
        print(userName.text.toString())
//        val client : ClientK = ClientK()
//        client.sendData(userName.text.toString())
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
