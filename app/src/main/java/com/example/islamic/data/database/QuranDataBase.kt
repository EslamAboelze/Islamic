package com.example.islamic.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.islamic.data.localdatabase.Aya
import com.example.islamic.data.localdatabase.Sora

const val DATABASE_NAME = "Quran_DataBase"

@Database(entities = [Aya::class], version = 1,exportSchema = false) //the name of table in database and version
abstract  class QuranDataBase : RoomDatabase() {
    abstract fun quranDaw(): QuarnDao
    companion object{
        private var INSTANCE: QuranDataBase? = null
        fun getInstance(context:Context): QuranDataBase{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context,
                    QuranDataBase::class.java,
                    DATABASE_NAME).createFromAsset("databases/quran.db").allowMainThreadQueries()
                    .build()
            }
            return INSTANCE as QuranDataBase
        }
    }
}


