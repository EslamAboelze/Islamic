package com.example.islamic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.islamic.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
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
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.quran.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_soraListFragment2)
        }
        binding.bearish.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_taspeh)
        }
        binding.remembrance.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_zykr)

        }
        binding.storyoftheprphet.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_stories)

        }
    }


}