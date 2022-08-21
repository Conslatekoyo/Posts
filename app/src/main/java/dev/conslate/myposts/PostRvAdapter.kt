package dev.conslate.myposts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.conslate.myposts.databinding.PostListItemBinding

class PostRvAdapter(var postList: List<Post>):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var binding= PostListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPost=postList.get(position)
        with(holder.binding){
            tvuserid.text=currentPost.userid.toString()
            tvid.text=currentPost.id.toString()
            tvtitle.text=currentPost.title
            tvbody.text=currentPost.body

            var context= holder.itemView.context
            holder.binding.cvposts.setOnClickListener{
                val intent=Intent(context,CommentActivity::class.java)
                intent.putExtra("POST_ID",currentPost.id)
                context.startActivity(intent)
            }


        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}
class PostViewHolder(var binding:PostListItemBinding):RecyclerView.ViewHolder(binding.root)
