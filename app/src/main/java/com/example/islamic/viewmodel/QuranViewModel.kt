package com.example.islamic.viewmodel

import android.content.Context
import com.example.islamic.data.PageManager
import com.example.islamic.data.database.QuarnDao
import com.example.islamic.data.database.QuranDataBase
import com.example.islamic.data.localdatabase.Sora

class QuranViewModel {

    fun getQuranImagebypagenumber(context: Context, pagenumber: Int): Int {   //return id of image
        return PageManager.setQuranImagebypagenumber(context, pagenumber)
    }

}