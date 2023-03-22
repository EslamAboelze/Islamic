package com.example.islamic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.islamic.R
import com.example.islamic.StoriesDirections
import com.example.islamic.ZykrDirections
import com.example.islamic.model.Prophets

class ProphetRecylerAdapter() : RecyclerView.Adapter<ProphetRecylerAdapter.ViewHolder>() {
    lateinit var context: Context
    lateinit var indexofprophet: List<Prophets>
    lateinit var fragment: Fragment

    constructor(context: Context, Indexofprophet: List<Prophets>, fragment: Fragment) : this() {
        this.context = context
        this.indexofprophet = Indexofprophet
        this.fragment = fragment
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View =LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_rom_prophet,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return indexofprophet.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(indexofprophet.get(position))
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val indexofprophet :TextView=itemView.findViewById(R.id.numbeofprophet)
        val nameofprophet:TextView =itemView.findViewById(R.id.nameofprophet)
        fun bind(prophets: Prophets){
            indexofprophet.text=prophets.id.toString()
            nameofprophet.text=prophets.name
            itemView.setOnClickListener{
                NavHostFragment.findNavController(fragment).navigate(
                    StoriesDirections.actionStoriesToLifeOfProphet(prophets.description,prophets.name)
                )
            }
        }

    }


}