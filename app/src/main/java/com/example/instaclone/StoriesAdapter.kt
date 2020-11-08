package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_stories.view.*
import kotlinx.android.synthetic.main.row_stories.view.imgStory as imgStory1


class StoriesAdapter(var storiesList:List<Story>):RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
    var rowview= LayoutInflater.from(parent.context).inflate(R.layout.row_stories, parent, false)
        return StoriesViewHolder(rowview);
    }

    override fun getItemCount(): Int {
       return storiesList.size
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val stories=storiesList.get(position)
        holder.rowview.tvStoryName.text= stories.username
        Glide.with(holder.rowview.context)
            .load(stories.imageURL)
            .circleCrop()
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.rowview.imgStory1)

    }

    class StoriesViewHolder(val rowview: View): RecyclerView.ViewHolder(rowview)


}