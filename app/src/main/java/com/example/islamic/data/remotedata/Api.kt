package com.example.islamic

import com.example.islamic.model.PrayerTimes
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface IPrayerApiService {

    @GET("{city}.json?key=e80be1e0fb69f0e3296e7a9ef673c02d")
    fun getApiResponse(@Path("city") city: String): Call<PrayerTimes>

    companion object {
        private const val baseUrl = "https://muslimsalat.com/"
        fun create(): IPrayerApiService {
            val retrofit = Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(IPrayerApiService::class.java)

        }
    }
}
