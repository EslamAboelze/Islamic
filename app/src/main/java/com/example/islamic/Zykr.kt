package com.example.islamic

import android.content.Context
import android.content.res.Resources
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islamic.adapter.AzkarRecylerAdapter
import com.example.islamic.data.localdatabase.AzzkarAssets
import com.example.islamic.databinding.FragmentZykrBinding
import com.example.islamic.model.AzkarCatogries
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.Charset


class Zykr : Fragment() {
    private val viewItems: ArrayList<AzkarCatogries> = ArrayList()
    private val TAG = "MainActivity"
    lateinit var binding: FragmentZykrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentZykrBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recylerAdapter = AzkarRecylerAdapter(viewItems, this.requireContext(),this)
        binding.recylerZykr.setHasFixedSize(true)
        binding.recylerZykr.adapter = recylerAdapter
        addItemsFromJSON()

    }

    fun addItemsFromJSON() {
        try {

            val jsonDataString: String = AzzkarAssets.loadJSONFromAsset(requireContext())
            val jsonArray = JSONArray(jsonDataString)
            for (i in 0..jsonArray.length()) {
                val itemObj: JSONObject = jsonArray.getJSONObject(i)
                val id:Int =itemObj.getInt("id")
                val name: String = itemObj.getString("name")
                val description: String = itemObj.getString("description")
                val azkarCatogries: AzkarCatogries = AzkarCatogries(id,name,description)
                viewItems.add(azkarCatogries)
            }
        } catch (e: Exception) {
            Log.d(TAG, "addItemsFromJSON: ", e)
        }
    }
}











