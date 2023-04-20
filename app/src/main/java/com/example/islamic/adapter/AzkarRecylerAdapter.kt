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
import com.example.islamic.model.AzkarCatogries
import com.example.islamic.ui.ZykrDirections

class AzkarRecylerAdapter() : RecyclerView.Adapter<AzkarRecylerAdapter.ViewHolder>() {
    private var type: Int = 1
    lateinit var nameOfzyker: List<AzkarCatogries>
    lateinit var context: Context
    lateinit var fragment: Fragment

    constructor(indexOfZykr: List<AzkarCatogries>, context: Context, fragment: Fragment) : this() {
        this.nameOfzyker = indexOfZykr
        this.context = context
        this.fragment = fragment
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_row_azkaar, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: AzkarRecylerAdapter.ViewHolder, position: Int) {
        val viewType = getItemViewType(position)

        when (viewType) {
            type -> {
                val itemViewHolder = holder
                val azkarCatogries: AzkarCatogries = nameOfzyker.get(position)
                itemViewHolder.zykrName.text = azkarCatogries.name

            }
            else -> {
                val itemViewHolder = holder
                val azkarCatogries: AzkarCatogries = nameOfzyker.get(position)
                itemViewHolder.zykrName.text = azkarCatogries.name

            }
        }
        holder.bind(nameOfzyker.get(position))
    }


    override fun getItemCount(): Int {
        return nameOfzyker.size
    }

    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val zykrName: TextView = itemview.findViewById(R.id.name_of_zykr)
        fun bind(azkarCatogries: AzkarCatogries) {
            val arrayOfArgs = arrayOf(azkarCatogries.description, azkarCatogries.name)
            itemView.setOnClickListener {

               NavHostFragment.findNavController(fragment).navigate(
                    ZykrDirections.actionZykrToDescriptionOfZyker(azkarCatogries.description,azkarCatogries.name)
                )


            }
        }
    }
}

/*  fun bind(zykr: AzkarCatogries) {
      zykrName.text = zykr.text.toString()
      /*itemView.setOnClickListener {
          NavHostFragment.findNavController(fragment).navigate(
              SoraListFragmentDirections.actionSoraListFragment2ToQuranFragmentContainer(sora.startPage)
          )
      }


*/