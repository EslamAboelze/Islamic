package com.example.islamic.model


import com.google.gson.annotations.SerializedName

data class PrayerTimes(
    @SerializedName("address")
    val address: String? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("country_code")
    val countryCode: String? = null,
    @SerializedName("daylight")
    val daylight: String? = null,
    @SerializedName("for")
    val forX: String? = null,
    @SerializedName("items")
    val items: List<Item?>? = null,
    @SerializedName("latitude")
    val latitude: String? = null,
    @SerializedName("link")
    val link: String? = null,
    @SerializedName("longitude")
    val longitude: String? = null,
    @SerializedName("map_image")
    val mapImage: String? = null,
    @SerializedName("method")
    val method: Int? = null,
    @SerializedName("postal_code")
    val postalCode: String? = null,
    @SerializedName("prayer_method_name")
    val prayerMethodName: String? = null,
    @SerializedName("qibla_direction")
    val qiblaDirection: String? = null,
    @SerializedName("query")
    val query: String? = null,
    @SerializedName("sealevel")
    val sealevel: String? = null,
    @SerializedName("state")
    val state: String? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null,
    @SerializedName("status_description")
    val statusDescription: String? = null,
    @SerializedName("status_valid")
    val statusValid: Int? = null,
    @SerializedName("timezone")
    val timezone: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("today_weather")
    val todayWeather: TodayWeather? = null
)