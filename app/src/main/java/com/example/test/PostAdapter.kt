package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.test.Model.Post


class PostAdapter:RecyclerView.Adapter<PostAdapter.postviewholder> {
    lateinit var mdata:List<Post>

    constructor(mdata: List<Post>) : super() {
        this.mdata = mdata
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postviewholder {
        var view:View = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false)
        return postviewholder(view)

    }

    override fun getItemCount(): Int {
        return mdata.size
    }

    override fun onBindViewHolder(holder: postviewholder, position: Int) {
        var post = mdata.get(position)
        Glide.with(holder.itemView.context).load(mdata.get(position).info).transform(CenterCrop(),RoundedCorners(16)).into(holder.imgProfile)
        holder.nick.setText(post.nick_info)
        holder.post.setText(post.text_info)
        Glide.with(holder.itemView.context).load(mdata.get(position).info).transform(CenterCrop(),RoundedCorners(16)).into(holder.imgProfile)

    }



    class postviewholder:RecyclerView.ViewHolder{
        var imgProfile:ImageView
        var nick:TextView
        var post:TextView



        constructor(itemView: View) : super(itemView){
            imgProfile = itemView.findViewById(R.id.Avatar)
            nick = itemView.findViewById(R.id.Nick)
            post = itemView.findViewById(R.id.Post)


        }
    }
}