package com.example.islamic.data.localdatabase

import android.content.Context
import java.io.IOException
import java.io.InputStream

class AzzkarAssets {
    companion object{
        fun loadJSONFromAsset(context: Context): String {
            val json: String?
            try {
                val inputStream: InputStream = context.assets.open("zykra.json")
                val size = inputStream.available()
                val buffer = ByteArray(size)
                // val charset: Charset = Charsets.UTF_8
                inputStream.read(buffer)
                inputStream.close()
                json = String(buffer)
            } catch (ex: IOException) {
                ex.printStackTrace()
                return ""
            }
            return json
        }

    fun loadJSONProphetFromAsset(context: Context): String {
        val json: String?
        try {
            val inputStream: InputStream = context.assets.open("ProphetStories.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            // val charset: Charset = Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }
}
}
