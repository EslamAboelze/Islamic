package com.example.islamic.model


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("asr")
    val asr: String? = null,
    @SerializedName("date_for")
    val dateFor: String? = null,
    @SerializedName("dhuhr")
    val dhuhr: String? = null,
    @SerializedName("fajr")
    val fajr: String? = null,
    @SerializedName("isha")
    val isha: String? = null,
    @SerializedName("maghrib")
    val maghrib: String? = null,
    @SerializedName("shurooq")
    val shurooq: String? = null
)