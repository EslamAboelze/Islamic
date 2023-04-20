package com.example.islamic.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.adapter.ProphetRecylerAdapter
import com.example.islamic.data.localdatabase.AzzkarAssets
import com.example.islamic.databinding.FragmentStoriesBinding
import com.example.islamic.model.Prophets
import org.json.JSONArray
import org.json.JSONObject

class Stories : Fragment() {
    lateinit var binding: FragmentStoriesBinding
    private val viewItems: ArrayList<Prophets> = ArrayList()
    val TAG ="mainactivity"

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
        binding = FragmentStoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val prophetRecylerAdapter = ProphetRecylerAdapter(requireContext(), viewItems, this)
        binding.listOfProphet.setHasFixedSize(true)
        binding.listOfProphet.adapter = prophetRecylerAdapter
        addItemsFromJSON()
    }
    fun addItemsFromJSON() {
        try {

            val jsonDataString: String = AzzkarAssets.loadJSONProphetFromAsset(requireContext())
            val jsonArray = JSONArray(jsonDataString)
            for (i in 0..jsonArray.length()) {
                val itemObj: JSONObject = jsonArray.getJSONObject(i)
                val id:Int =itemObj.getInt("id")
                val name: String = itemObj.getString("name")
                val description: String = itemObj.getString("description")
                val prophets: Prophets = Prophets(id, name, description)
                viewItems.add(prophets)
            }
        } catch (e: Exception) {
            Log.d(TAG, "addItemsFromJSON: ", e)
        }
    }


}