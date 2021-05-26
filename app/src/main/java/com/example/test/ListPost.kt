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

        val NickPhoto = mutableMapOf<String, Int>(
            "Yaroslav Mishchenko" to R.drawable.test1,
            "Petara94" to R.drawable.test3,
            "Kostya Alaev" to R.drawable.test2,
            "MrShim1337" to R.drawable.coolman,
            "Anon" to R.drawable.test4
        );
    }


    lateinit var RvPost: RecyclerView
    lateinit var postAdapter: PostAdapter
    // lateinit var mdata:ArrayList<Post>

    fun initViews() {
        RvPost = findViewById(R.id.PostList)
        RvPost.layoutManager = LinearLayoutManager(this)
        RvPost.setHasFixedSize(true)

    }

    fun sharebutton(view: View) {
        val toast = Toast.makeText(applicationContext, "В разработке", Toast.LENGTH_LONG)
        toast.show()
    }

    fun commentbutton(view: View) {
        val toast = Toast.makeText(applicationContext, "В разработке", Toast.LENGTH_LONG)
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
                NickPhoto["Yaroslav Mishchenko"] ?: R.drawable.test4,
                "Yaroslav Mishchenko",
                "Минусы уборки: - тратишь на это целый день - после уборки уже нет сил - постоянно нервничаешь - не можешь потом ничего найти Плюсы уборки: - в конце уборки нажимать на кнопку пылесоса и смотреть как шнур засасывается обратно)"
            )
        )
        mdata.add(
            Post(
                NickPhoto["Kostya Alaev"] ?: R.drawable.test4,
                "Kostya Alaev",
                "давайте на минуту остановимся и обсудим действительно важные вопросы например почему железногорск до сих пор не притянулся к магнитогорску"
            )
        )
        mdata.add(
            Post(
                NickPhoto["Petara94"] ?: R.drawable.test4,
                "Petara94",
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