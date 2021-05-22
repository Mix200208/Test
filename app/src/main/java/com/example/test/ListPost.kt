package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Model.Post
import java.util.ArrayList

class ListPost : AppCompatActivity() {
   // val names = mutableListOf<String>(
   //         "Ярык super.onCreate(savedInstanceState)        setContentView(R.layout.activity_list_post) super.onCreate(savedInstanceState)       setContentView(R.layout.activity_list_post)",
   //         "Danil",
    //        "Kostya",
    //        "Ярык",
    //        "Danil",
      //      "Kostya",
      //      "Ярык",
       //     "Danil",
      //      "Kostya",
       //     "Ярык",
        //    "Danil",
       //     "Kostya",
        //    "Ярык",
       //     "Danil",
       //     "Kostya",
        //    "1",
       //     "2",
        //    "3",
        //    "4",
        //    "5",
        //    "6",
        //    "7"
 //   )
    lateinit var RvPost:RecyclerView
    lateinit var postAdapter:PostAdapter
    lateinit var mdata:ArrayList<Post>

    fun initViews(){
        RvPost = findViewById(R.id.PostList)
        RvPost.layoutManager=LinearLayoutManager(this)
        RvPost.setHasFixedSize(true)

    }



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_post)

      //  val listPost: ListView = findViewById(R.id.postNews)
        //val adapter = ArrayAdapter<String>(this, R.layout.post_1,
                                          // names)

       // listPost.adapter = adapter
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
        mdata.add(Post(R.drawable.test1))
        mdata.add(Post(R.drawable.test1))
        mdata.add(Post(R.drawable.test1))
        mdata.add(Post(R.drawable.test1))

    }

    fun clickOnSearchButton(view: View) {
        val intent = Intent(this,Search::class.java)
        startActivity(intent)
    }

    fun clickOnHomeButton(view: View) {
        val intent = Intent(this,MainTestActivity::class.java)
        startActivity(intent)
    }
}