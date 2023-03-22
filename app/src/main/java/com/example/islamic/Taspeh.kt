package com.example.islamic

import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.adapter.ArrayAdapterOfCustomSpinner
import com.example.islamic.databinding.FragmentTaspehBinding
import com.example.islamic.model.praise


class Taspeh : Fragment() {
     var mysharedPreferences: SharedPreferences? = null
    lateinit var binding: FragmentTaspehBinding
    var countera = 0
    var counterb = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //  binding.start.setOnClickListener {

            // binding.textView4. =counter .toString()
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTaspehBinding.inflate(inflater, container, false)
        return binding.root
        backofdata()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onstart()
        onreset()
        setupcustomspinner()
        backofdata()
        onstartclear()
    }

    private fun onstartclear() {
        binding.clearBtn.setOnClickListener {
            counterb =0
            binding.totalNum.text = counterb.toString()
        }
    }

    private fun backofdata() {
        val databack = context?.getSharedPreferences(constans.sharedPreferences, 0)
        val totalofdata = databack?.getString("total",databack.toString())  //use this method to get the string data are you sitting
        val totalofbearish =databack?.getString("bearish",databack.toString())
        binding.nomberOfTsapeh.text=totalofbearish
        binding.totalNum.text = totalofdata
    }



    private fun onreset() {
        binding.reset.setOnClickListener {
            countera = 0

            binding.nomberOfTsapeh.text = countera.toString()

        }
    }

    private fun onstart() {
        binding.start.setOnClickListener {
            countera++
            counterb++
            binding.nomberOfTsapeh.text = countera.toString()
            binding.totalNum.text = counterb.toString()
            mysharedPreferences=context?.getSharedPreferences(constans.sharedPreferences,0)
            var editor:SharedPreferences.Editor=mysharedPreferences!!.edit()
            var totalnumber =binding.totalNum.text.toString()
            val totalofbearish =binding.nomberOfTsapeh.text.toString()
            editor.putString("total",totalnumber)
            editor.putString("bearish",totalofbearish)
            editor.commit()

        }
    }

    private fun setupcustomspinner() {
        var dapter = ArrayAdapterOfCustomSpinner(this.requireContext(), praise.list!!)
        binding.spinner2.adapter = dapter
    }

}

