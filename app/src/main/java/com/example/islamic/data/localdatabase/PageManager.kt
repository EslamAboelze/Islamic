package com.example.islamic.data.localdatabase

import android.content.Context
import java.text.DecimalFormat

class PageManager {
    companion object {
        fun setQuranImagebypagenumber(
            context: Context,
            pagenumber: Int
        ): Int {   //return id of image
            val formatter = DecimalFormat("000")
            val drawablename: String = "page" + formatter.format(pagenumber)
            return context.resources.getIdentifier(drawablename, "drawable", context.packageName)
        }
    }
}