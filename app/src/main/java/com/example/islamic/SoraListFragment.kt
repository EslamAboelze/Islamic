package com.example.islamic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.islamic.adapter.SoraRecylerAdapter
import com.example.islamic.databinding.FragmentSoraLIsrBinding
import com.example.islamic.viewmodel.SoraviewModel

class SoraListFragment : Fragment() {
    lateinit var binding: FragmentSoraLIsrBinding
    lateinit var soraviewModel: SoraviewModel


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
        binding = FragmentSoraLIsrBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        soraviewModel = ViewModelProvider(this)[SoraviewModel::class.java]
        binding.listofsora.adapter =
            SoraRecylerAdapter(requireContext(), soraviewModel.getAllSora(),this)
        binding.listofsora.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

    }
}

