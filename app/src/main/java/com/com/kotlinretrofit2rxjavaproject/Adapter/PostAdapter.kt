package com.com.kotlinretrofit2rxjavaproject.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.com.kotlinretrofit2rxjavaproject.Model.Post
import com.com.kotlinretrofit2rxjavaproject.R
import java.lang.StringBuilder

class PostAdapter(internal var context: Context,internal var postList: List<Post>) : RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        Log.i("size", postList.size.toString())
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.txtAuthor.text = postList[position].userId.toString()
        holder.txtTitle.text = postList[position].title
        holder.txtContent.text =
            StringBuilder(postList[position].body.substring(0, 20)).append("....").toString()
    }

}