package com.example.islamic.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.islamic.data.database.QuarnDao
import com.example.islamic.data.database.QuranDataBase
import com.example.islamic.model.Sora

class SoraviewModel :AndroidViewModel {
    constructor(application: Application) : super(application)


    fun getAllSora(): ArrayList<Sora> {
        val quarnDao:QuarnDao=QuranDataBase.getInstance(getApplication()).quranDaw()
        val soras = ArrayList<Sora>()
        for (i in 1..114) {
            soras.add(quarnDao.getSoraByNumber(i))
        }
        return soras
    }
}
