package com.example.islamic.ui

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.adapter.ArrayAdapterOfCustomSpinner
import com.example.islamic.databinding.FragmentTaspehBinding
import com.example.islamic.model.praise
import com.example.islamic.uitils.constant

class Taspeh : Fragment() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var binding: FragmentTaspehBinding
    var TotalOfBearishNum: Int? = null
    var bearishNum: Int? = null
    var totalCount: Int? = null
    var singleCount:Int?=null

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
        binding = FragmentTaspehBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupCustomSpinner()
        onActionOfPress()
        ShowDataFromSharedPref()
        totalCount = TotalOfBearishNum
        singleCount = bearishNum
        clearSingleNumber()
        clearTotalNumber()

    }
    private fun clearTotalNumber() {
        binding.clearTotal.setOnClickListener {
            totalCount = 0
            binding.totalNum.text="0"
        }
    }

    private fun clearSingleNumber() {
        binding.reset.setOnClickListener {
            singleCount = 0
            binding.numbers.text = "0"
        }
    }

    private fun onActionOfPress() {
        totalCount = 0
        singleCount = 0
        binding.press.setOnClickListener {
            sharedPreferences = context?.getSharedPreferences(constant.nameOfShared, 0)!!
            val editor = sharedPreferences.edit()
            editor.putString(constant.totalNumber, totalCount.toString())
            editor.putString(constant.customNumber, singleCount.toString())
            totalCount = totalCount!! + 1
            singleCount = singleCount!! + 1
            editor.commit()
            ShowDataFromSharedPref()
        }
    }

    private fun ShowDataFromSharedPref() {

        val backOfNumber = context?.getSharedPreferences(constant.nameOfShared, 0)
        TotalOfBearishNum = backOfNumber?.getString(constant.totalNumber, "0")?.toInt()
        bearishNum =
            backOfNumber?.getString(constant.customNumber, "0")?.toInt()
        if (TotalOfBearishNum != 0 && bearishNum != 0) {

            binding.totalNum.text = TotalOfBearishNum.toString()
            binding.numbers.text = bearishNum.toString()

        } else {
            binding.totalNum.text = totalCount.toString()
            binding.numbers.text = singleCount.toString()
        }
    }


    private fun setupCustomSpinner() {
        val dapter = ArrayAdapterOfCustomSpinner(this.requireContext(), praise.list!!)
        binding.spinner.adapter = dapter
    }

}

