package dev.conslate.myposts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.conslate.myposts.databinding.CommentListItemBinding
import dev.conslate.myposts.databinding.PostListItemBinding

class RvAdapterComment (var commentList:List<Comment>): RecyclerView.Adapter<CommdntViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommdntViewHolder {
        var binding = CommentListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CommdntViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return commentList.size
    }

    override fun onBindViewHolder(holder: CommdntViewHolder, position: Int) {
        var currentComent = commentList.get(position)

        with(holder.binding){
            idtitle.text = currentComent.name
            idbody.text = currentComent.body

        }

    }
}
class CommdntViewHolder(var binding: CommentListItemBinding): RecyclerView.ViewHolder(binding.root)

