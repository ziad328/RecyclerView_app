package com.example.facebook_posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior
import org.w3c.dom.Text

class PostsAdapter(val items: List<Post>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentTextView : TextView = itemView.findViewById(R.id.post_tv)
        val nameTextView : TextView = itemView.findViewById(R.id.person_name_tv)
        val imagePostImageView : ImageView = itemView.findViewById(R.id.post_mv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = items[position]
        holder.contentTextView.text = post.content
        holder.nameTextView.text = post.name
        holder.imagePostImageView.setImageResource(post.image)

    }
}