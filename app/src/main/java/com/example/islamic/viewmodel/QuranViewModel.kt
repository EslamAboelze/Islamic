package com.example.islamic.viewmodel

import android.content.Context
import com.example.islamic.data.localdatabase.PageManager

class QuranViewModel {

    fun getQuranImagebypagenumber(context: Context, pagenumber: Int): Int {   //return id of image
        return PageManager.setQuranImagebypagenumber(context, pagenumber)
    }

}