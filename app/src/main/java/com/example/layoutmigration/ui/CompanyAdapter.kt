package com.example.layoutmigration.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutmigration.databinding.CompanyItemBinding
import com.example.layoutmigration.model.Company

class CompanyAdapter : ListAdapter<Company, CompanyAdapter.PostViewHolder>(PostDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            CompanyItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = getItem(position)
        if (post != null) {
            holder.bind(post)
        }
    }

    class PostViewHolder(
        private val binding: CompanyItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Company) {
            binding.apply {
                company = item
                executePendingBindings()
            }
        }


    }

}



private class PostDiffCallback : DiffUtil.ItemCallback<Company>() {
    override fun areItemsTheSame(oldItem: Company, newItem: Company): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Company, newItem: Company): Boolean {
        return oldItem == newItem
    }
}