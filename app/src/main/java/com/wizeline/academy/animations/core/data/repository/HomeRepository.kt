package com.wizeline.academy.animations.core.data.repository

import com.wizeline.academy.animations.ui.home.HomeItem
import com.wizeline.academy.animations.ui.home.homeItem
import javax.inject.Inject
import kotlin.random.Random

class HomeRepository @Inject constructor() {

    private val ids = listOf(
        1,
        10,
        100,
        1000,
        1001,
        1005,
        1006,
        1008,
        1009,
        101,
        1011,
        1013,
        1014,
        1015,
        1016,
        1018,
        1019,
        102,
        1020,
        1021,
        1022,
        1023,
        1024,
        1025
    )

    fun fetchMockedImages(): List<HomeItem> = (1..10).map { createNewHomeItem() }

    private fun createNewHomeItem(): HomeItem = homeItem { imageId = getRandomId() }

    private fun getRandomId(): Int {
        val index = Random.nextInt(0, ids.size - 1)
        return ids[index]
    }
}