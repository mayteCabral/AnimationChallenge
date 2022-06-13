package com.wizeline.academy.animations.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.wizeline.academy.animations.databinding.ItemImageBinding
import com.wizeline.academy.animations.utils.loadImage

class HomeViewHolder(private val binding: ItemImageBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: HomeItem, onClickListener: (HomeItem) -> Unit) {
        binding.root.setOnClickListener { onClickListener.invoke(item) }
        binding.ivImage.loadImage(item.imageId)
    }
}