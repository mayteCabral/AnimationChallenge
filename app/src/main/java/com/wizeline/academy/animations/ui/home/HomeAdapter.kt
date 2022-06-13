package com.wizeline.academy.animations.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.wizeline.academy.animations.databinding.ItemImageBinding

class HomeAdapter(private var onClickListener: (HomeItem) -> Unit) :
    ListAdapter<HomeItem, HomeViewHolder>(HomeItemDiffer()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, onClickListener)
    }
}