package com.wizeline.academy.animations.ui.home

fun homeItem(block: HomeItem.() -> Unit) = HomeItem().apply(block)

data class HomeItem(var imageId: Int = 0)