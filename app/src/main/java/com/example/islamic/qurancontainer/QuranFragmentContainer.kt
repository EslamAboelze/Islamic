package com.example.islamic.qurancontainer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.adapter.QuranPageAdapter
import com.example.islamic.databinding.FragmentQuranContainerBinding

class QuranFragmentContainer : Fragment() {
    lateinit var binding: FragmentQuranContainerBinding
    lateinit var args: QuranFragmentContainerArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        args = QuranFragmentContainerArgs.fromBundle(requireArguments())
        binding = FragmentQuranContainerBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quranPageAdapter = QuranPageAdapter(this)
        binding.quranPager.apply {
            adapter = quranPageAdapter
            setCurrentItem(604 - args.startPage)


        }

    }


}