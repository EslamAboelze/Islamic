package com.example.islamic.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.databinding.FragmentLifeOfProphetBinding

class LifeOfProphet : Fragment() {
    lateinit var binding: FragmentLifeOfProphetBinding
    lateinit var args :LifeOfProphetArgs
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
        args =LifeOfProphetArgs.fromBundle(requireArguments())
        binding= FragmentLifeOfProphetBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tiltleOfProphet.text =args.name
        binding.prophetDescription.text=args.description

    }




}