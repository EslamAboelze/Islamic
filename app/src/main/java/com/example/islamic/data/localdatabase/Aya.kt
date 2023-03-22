package com.example.islamic.data.localdatabase

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quran")
data class Aya (
    @PrimaryKey
    var id:Int,

    var jozz :Int,
    var sora:Int,

    @NonNull
    var sora_name_en:String,

    @NonNull
    var  sora_name_ar :String,

    var page:Int,
    var line_start:Int,
    var  line_end:Int,
    var aya_no :Int,

    @NonNull
    var  aya_text:String,
    @NonNull
    var aya_text_emlaey:String,
)