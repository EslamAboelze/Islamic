package com.example.islamic.data.database

import androidx.room.Dao
import androidx.room.Query
import com.example.islamic.model.Sora

@Dao
interface QuarnDao {

  //  @Query("SELECT * FROM quran WHERE page = :page")
   // fun getAyaByPage(page: Int): List<Aya>

    @Query("SELECT sora as soraNumber, MIN(page) as startPage ,MAX(page) as endPage ,sora_name_ar as arabicName,sora_name_en as englishName FROM quran WHERE sora = :soraNumber")
    fun getSoraByNumber(soraNumber: Int): Sora

   // @Query("SELECT jozz as jozzNumber, MIN(page) as startPage ,MAX(page) as endPage FROM quran WHERE jozz = :jozzNumber")
 //   fun getJozzByNumber(jozzNumber: Int): Jozz


  //  @Query("SELECT * FROM quran WHERE aya_text_emlaey LIKE '%' || :keyword || '%'")
   // fun getAyaBySubText(keyword: String): List<Aya>

}
