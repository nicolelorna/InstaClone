package com.example.instaclone.Fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.MainActivity
import com.example.instaclone.R
import com.example.instaclone.StoriesAdapter
import com.example.instaclone.Story
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_home, menu)
        setHasOptionsMenu(true)
        showStories()
    }

    fun showStories() {
        var storiesList = ArrayList<Story>()
        storiesList.add(Story(imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRsBVJqW23fB9fTkHq0p8FHJkvKIWB8npvvwA&usqp=CAU", username = "Nikkie"))
        storiesList.add(Story(imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS_STk10uopMYcm6pei2HGsaMqi2RcsW6FpwQ&usqp=CAU", username = "James"))
        storiesList.add(Story(imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRTPFDNf4EhAvSEarjOGy6QLr3NNEf7AeczLQ&usqp=CAU", username = "Ivet"))
        storiesList.add(Story(imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRksxn6jjnbfEAT5o6mQ7E9dAoH97UgfuOmng&usqp=CAU", username = "Roy"))
        storiesList.add(Story(imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQCdahr_WlZoE1KXvSLln4WrdjAs2KldFZHrQ&usqp=CAU", username = "Yvonne"))
        storiesList.add(Story(imageURL = "https://www.google.com/search?q=small+images&newwindow=1&sa=X&bih=657&biw=1349&hl=en-GB&sxsrf=ALeKk03H2kkYfJDeNwElS8iSB8hQvAKHIQ:1604236938043&tbm=isch&source=iu&ictx=1&fir=6fPtAYMwMhq02M%252CajKXaCao7QY39M%252C_&vet=1&usg=AI4_-kQnHDCUX9Z35UOvv7Zt7Ajt9fn_Pw&ved=2ahUKEwifh8-muOHsAhVOPcAKHUijAH4Q9QF6BAgCEE4&cshid=1604237020880558#imgrc=6fPtAYMwMhq02M", username = "Ted"))

        val storiesAdapter = StoriesAdapter(storiesList)
        rvStories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvStories.adapter = storiesAdapter
    }
}
