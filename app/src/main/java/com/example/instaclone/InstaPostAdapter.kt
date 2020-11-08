package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class InstaPostAdapter(var instaPostList: List<InstaPost>):RecyclerView.Adapter<InstaPostAdapter.InstaPostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaPostViewHolder {
        var itemView  = LayoutInflater.from(parent.context).inflate(R.layout.row_post_item,parent, false)
        return InstaPostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return instaPostList.size

}

    override fun onBindViewHolder(holder: InstaPostViewHolder, position: Int) {
        var instaPost = instaPostList.get(position)
        Glide.with(holder.itemView.context)
            .load(instaPost.avatarURL)
            .circleCrop()
            .placeHolder(R.drawable.ic_profile_pic)
            .Into(holder.itemView.imgAvatar)

        holder.itemView.tvUsername.text =instaPost.username

        Glide.with(holder.itemView.context)
            .load (instaPost.imageURL)
            .placeHolder(R.drawable.ic_profile_pic)
            .into(holder.itemView.imgPost)

        holder.itemView.tvLikes.text ="${instaPost.}Likes"
        holder.itemView.
 

    }

    class InstaPostViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView)
}