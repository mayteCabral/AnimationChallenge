package com.wizeline.academy.animations.ui.home

import androidx.recyclerview.widget.DiffUtil

class HomeItemDiffer : DiffUtil.ItemCallback<HomeItem>() {

    override fun areItemsTheSame(oldItem: HomeItem, newItem: HomeItem): Boolean =
        oldItem.imageId == newItem.imageId

    override fun areContentsTheSame(oldItem: HomeItem, newItem: HomeItem): Boolean =
        oldItem == newItem
}