package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class InstaPostAdapter(var instaPostList: List<InstaPost>):RecyclerView.Adapter<InstaPostAdapter.InstaPostViewHolder>() {

    class InstaPostViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaPostViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_post_item,parent, false)
        return InstaPostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return instaPostList.size
        Glide.with()
    }

    override fun onBindViewHolder(holder: InstaPostViewHolder, position: Int) {
        var instaPost = instaPostList.get(position)

    }
}