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
import com.example.islamic.SoraListFragmentDirections
import com.example.islamic.data.localdatabase.Aya
import com.example.islamic.data.localdatabase.Sora

class SoraRecylerAdapter() : RecyclerView.Adapter<SoraRecylerAdapter.ViewHolder>() {

    lateinit var indexofSora: List<Sora>
    lateinit var context: Context
    lateinit var fragment: Fragment

    constructor(context: Context, itemlist: List<Sora>, fragment: Fragment) : this() {
        this.context = context
        this.indexofSora = itemlist
        this.fragment = fragment
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return indexofSora.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(indexofSora.get(position))
    }


    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val soraindex: TextView = itemview.findViewById(R.id.indexofsoura)
        val soraName: TextView = itemview.findViewById(R.id.nameofsoura)

        fun bind(sora: Sora) {
            soraindex.text = sora.soraNumber.toString()
            soraName.text = sora.arabicName
            itemView.setOnClickListener {
                NavHostFragment.findNavController(fragment).navigate(
                    SoraListFragmentDirections.actionSoraListFragment2ToQuranFragmentContainer(sora.startPage)
                )
            }

        }

    }
}
