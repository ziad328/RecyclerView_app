package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recyclerview.databinding.ActivityRecyclertestBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivityRecyclerTest extends AppCompatActivity {

    private ActivityRecyclertestBinding binding;
    private PostsAdapter postsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclertestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        postsAdapter = new PostsAdapter();
        postsAdapter.setPosts(getPosts());
        setupRecyclerView();


    }

    private List<Post> getPosts() {
        Post post1 = new Post("Ziad Seleem", "5 May 2023", "The International Criminal Court", R.drawable.image);
        Post post2 = new Post("Mostafa Adel", "20 Feb 2023", "Drinking water is good for your health", R.drawable.water);
        Post post3 = new Post("Elon Musk", "31 jan 2023", "Now twitter is mine!", R.drawable.musk);

        List<Post> posts = new ArrayList<Post>();

        int i = 0;
        while (i < 20) {
            posts.add(post1);
            posts.add(post2);
            posts.add(post3);
            i++;
        }

        return posts;
    }


    private void setupRecyclerView() {
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rvPosts.setLayoutManager(layoutManager);
        binding.rvPosts.setAdapter(postsAdapter);
        binding.rvPosts.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));

    }
}