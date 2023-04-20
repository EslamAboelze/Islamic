package com.example.islamic.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islamic.ViewPresenter
import com.example.islamic.data.database.IprayerView
import com.example.islamic.databinding.FragmentPrayerTimesBinding
import com.example.islamic.model.Item

class PrayerTimes : Fragment(), IprayerView {
    lateinit var binding: FragmentPrayerTimesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrayerTimesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewPresenter().getDataFromApi("Cairo",{item ->onDataCompleteFromApi(item!!)
        })
    }

    override fun onDataCompleteFromApi(prayer: Item) {
        binding.textViewFajrTime.text = prayer.fajr
        binding.textViewSunriseTime.text = prayer.shurooq
        binding.textViewDhuhrTime.text = prayer.dhuhr
        binding.textViewAsrTime.text = prayer.asr
        binding.textViewMaghribTime.text = prayer.maghrib
        binding.textViewIshaTime.text = prayer.isha
    }

    override fun onDataErrorFromApi(throwable: Throwable) {
        error("Error ${throwable.localizedMessage}")
    }

}