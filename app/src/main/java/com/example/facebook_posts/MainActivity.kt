package com.example.facebook_posts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facebook_posts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: PostsAdapter
    val posts = mutableListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecyclerView()


    }

    private fun setRecyclerView() {
        setPostsList()
        adapter = PostsAdapter(posts)
        binding.rvPosts.adapter = adapter
    }

    fun setPostsList() {
        for (i in 1..100){
            posts.add(Post("ziad Seleem","Buckle up, Because change is coming to WordPress",R.drawable.image))
        }
    }
}