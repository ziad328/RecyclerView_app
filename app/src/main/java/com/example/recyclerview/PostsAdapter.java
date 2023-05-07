package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.databinding.ItemBinding;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {


    public List<Post> posts;

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.ViewHolder holder, final int position) {

        Post post = posts.get(position);
        holder.binding.personNameTv.setText(post.getUserName());
        holder.binding.dateTv.setText(post.getDate());
        holder.binding.postTv.setText(post.getContent());
        holder.binding.postMv.setImageResource(post.getImage());


    }

    @Override
    public int getItemCount() {
        return posts == null ? 0 : posts.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;

        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
