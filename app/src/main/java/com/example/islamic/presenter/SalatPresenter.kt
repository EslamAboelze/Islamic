package com.example.islamic

import android.content.Context
import com.example.islamic.data.database.IprayerView
import com.example.islamic.model.Item
import com.example.islamic.model.PrayerTimes
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewPresenter() {
    fun getDataFromApi(city :String,onApiSuccess:(item:Item?)->Unit) {
        IPrayerApiService.create().getApiResponse(city).enqueue(object : Callback<PrayerTimes> {

            override fun onResponse(call: Call<PrayerTimes>, response: Response<PrayerTimes>) {
                onApiSuccess(response.body()?.items?.get(0))
              //  prayerview.onDataCompleteFromApi(response.body()?.items?.get(0) as Item)
            }

            override fun onFailure(call: Call<PrayerTimes>, t: Throwable) {
               // prayerview.onDataErrorFromApi(t)
            }

        })

    }


}