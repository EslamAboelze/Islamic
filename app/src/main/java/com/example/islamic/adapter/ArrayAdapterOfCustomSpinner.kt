package com.example.islamic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.islamic.R
import com.example.islamic.model.CustomSpinner
import com.example.islamic.model.praise

class ArrayAdapterOfCustomSpinner(context: Context,listofspraise:ArrayList<CustomSpinner>):ArrayAdapter<CustomSpinner>(context,0,listofspraise)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return init(position,convertView,parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return init(position,convertView,parent)
    }
    private fun init (position: Int, convertView: View?, parent: ViewGroup): View {
        val spraise =getItem(position)
        val view =LayoutInflater.from(context).inflate(R.layout.custom_spinner_view,parent,false)
        view.findViewById<TextView>(R.id.textView).text =spraise!!.text
        return view

    }
}