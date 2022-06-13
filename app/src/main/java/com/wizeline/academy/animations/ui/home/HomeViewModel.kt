package com.wizeline.academy.animations.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wizeline.academy.animations.core.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(var repository: HomeRepository) : ViewModel() {

    val images: LiveData<List<HomeItem>>
        get() = _images

    private val _images = MutableLiveData<List<HomeItem>>()

    init {
        fetchData()
    }

    private fun fetchData() {
        val images = repository.fetchMockedImages()
        _images.postValue(images)
    }
}