package com.com.kotlinretrofit2rxjavaproject.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_layout.view.*

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val txtAuthor = itemView.txt_author
    val txtTitle = itemView.txt_title
    val txtContent = itemView.txt_content
}