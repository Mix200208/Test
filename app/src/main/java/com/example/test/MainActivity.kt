package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes
import java.net.Socket

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        // findViewById<класс объекта>(id нашего объекта)
        val name = findViewById<Button>(R.id.button)

        var count = 0

    }

    fun click(view: View){
        // context, 3 переменная - длительность отображения
        val mes = Intent(this,MainTestActivity::class.java)
        startActivity(mes)

    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()

        }

    }
