package com.example.islamic.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.R
import com.example.islamic.databinding.FragmentDescriptionOfZykerBinding
import com.example.islamic.model.AzkarCatogries
import com.example.islamic.qurancontainer.QuranFragmentContainerArgs

class DescriptionOfZyker : Fragment() {
    lateinit var binding: FragmentDescriptionOfZykerBinding
    lateinit var args: DescriptionOfZykerArgs

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
        args = DescriptionOfZykerArgs.fromBundle(requireArguments())
        binding = FragmentDescriptionOfZykerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.zykerDescription.text=args.description
        binding.tiltleOfZyker.text=args.name

    }


}