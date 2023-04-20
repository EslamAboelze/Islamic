package com.example.islamic.data.database

import com.example.islamic.model.Item

interface IprayerView {
    fun onDataCompleteFromApi(prayer: Item)
    fun onDataErrorFromApi(throwable: Throwable)
}