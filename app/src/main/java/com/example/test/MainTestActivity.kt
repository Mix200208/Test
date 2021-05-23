package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Model.Post
import java.util.ArrayList

class MainTestActivity : AppCompatActivity() {
    lateinit var listAdapter: ListAdapter
    lateinit var RvPost: RecyclerView
    lateinit var postAdapter:PostAdapter
    lateinit var mdata:ArrayList<Post>

    fun initViews(){
        RvPost = findViewById(R.id.HomePost)
        RvPost.layoutManager= LinearLayoutManager(this)
        RvPost.setHasFixedSize(true)

    }
    fun clickOnHomeButton(){
        val intent = Intent(this,
                ListPost::class.java)
        startActivity(intent)
    }
    fun Vote(view: View){
        val text = "Вы проголосовали!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main_test)





        initViews()
        initdataPost()
        postAdapt()
    }

    private fun postAdapt() {
        postAdapter = PostAdapter(mdata)
        RvPost.adapter = postAdapter

    }

    private fun initdataPost() {
        mdata = ArrayList<Post>()
        mdata.add(Post(R.drawable.test1,"Yaroslav Mishchenko","Минусы уборки: - тратишь на это целый день - после уборки уже нет сил - постоянно нервничаешь - не можешь потом ничего найти Плюсы уборки: - в конце уборки нажимать на кнопку пылесоса и смотреть как шнур засасывается обратно)"))
        mdata.add(Post(R.drawable.test1,"Yaroslav Mishchenko","Минусы уборки: - тратишь на это целый день - после уборки уже нет сил - постоянно нервничаешь - не можешь потом ничего найти Плюсы уборки: - в конце уборки нажимать на кнопку пылесоса и смотреть как шнур засасывается обратно)"))
        mdata.add(Post(R.drawable.test1,"Yaroslav Mishchenko","Минусы уборки: - тратишь на это целый день - после уборки уже нет сил - постоянно нервничаешь - не можешь потом ничего найти Плюсы уборки: - в конце уборки нажимать на кнопку пылесоса и смотреть как шнур засасывается обратно)"))



    }

    companion object{
        const val USER_NAME = "username"
    }

    fun clickOnSearchButton(view: View) {
        val intent = Intent(this,Search::class.java)
        startActivity(intent)
    }


}