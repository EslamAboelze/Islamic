package com.example.islamic.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.databinding.FragmentQuranBinding
import com.example.islamic.viewmodel.QuranViewModel


class Quran(private var pageNumber: Int) : Fragment() {
    lateinit var binding: FragmentQuranBinding
    lateinit var quranViewModel :QuranViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        quranViewModel= QuranViewModel()
        binding=FragmentQuranBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quranpage:Int=quranViewModel.getQuranImagebypagenumber(requireContext(), pageNumber)
        binding.quranPage.setImageResource(quranpage)
    }
}