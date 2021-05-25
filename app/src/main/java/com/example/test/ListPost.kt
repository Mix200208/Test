package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Model.Post
import java.util.*

class ListPost : AppCompatActivity() {

    companion object {
        /* val post_name : String = "";
         val post_data : String = "";*/

        val mdata = ArrayList<Post>()

        var isStartedYet = false;

        fun addPost(post: Post) {
            mdata.add(post);
        }
    }

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
    lateinit var RvPost: RecyclerView
    lateinit var postAdapter: PostAdapter
    // lateinit var mdata:ArrayList<Post>

    fun initViews() {
        RvPost = findViewById(R.id.PostList)
        RvPost.layoutManager = LinearLayoutManager(this)
        RvPost.setHasFixedSize(true)

    }

    fun sharebutton(view: View) {
        val toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG)
        toast.show()
    }

    fun commentbutton(view: View) {
        val toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG)
        toast.show()
    }

    fun Vote(view: View) {
        val text = "Вы проголосовали!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_post)

        //  val listPost: ListView = findViewById(R.id.postNews)
        //val adapter = ArrayAdapter<String>(this, R.layout.post_1,
        // names)

        // listPost.adapter = adapter
        initViews()

        if (!isStartedYet) {
            initdataPost()
            isStartedYet = true;
        }

        postAdapt()
    }

    private fun postAdapt() {
        postAdapter = PostAdapter(mdata)
        RvPost.adapter = postAdapter

    }

    fun CreatePost(view: View) {
        val intent = Intent(this, CreatePost::class.java)
        startActivity(intent)
    }


    private fun initdataPost() {
        mdata.add(
            Post(
                R.drawable.test1,
                "Yaroslav Mishchenko",
                "Минусы уборки: - тратишь на это целый день - после уборки уже нет сил - постоянно нервничаешь - не можешь потом ничего найти Плюсы уборки: - в конце уборки нажимать на кнопку пылесоса и смотреть как шнур засасывается обратно)"
            )
        )
        mdata.add(
            Post(
                R.drawable.test2,
                "Kostya Alaev",
                "давайте на минуту остановимся и обсудим действительно важные вопросы например почему железногорск до сих пор не притянулся к магнитогорску"
            )
        )
        mdata.add(
            Post(
                R.drawable.test3,
                "Petya Iskorkin",
                " it et nibh dignissim, sit amet maximus orci maximus. Vestibulum imperdiet pulvinar dapibus. Duis ultrices congue massa id rhoncus."
            )
        )


    }

    fun clickOnSearchButton(view: View) {
        val intent = Intent(this, Search::class.java)
        startActivity(intent)
    }

    fun clickOnHomeButton(view: View) {
        val intent = Intent(this, MainTestActivity::class.java)
        startActivity(intent)

    }


}