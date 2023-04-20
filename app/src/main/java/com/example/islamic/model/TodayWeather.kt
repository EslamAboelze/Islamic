package com.example.islamic.model


import com.google.gson.annotations.SerializedName

data class TodayWeather(
    @SerializedName("pressure")
    val pressure: String? = null,
    @SerializedName("temperature")
    val temperature: String? = null
)