package com.example.islamic.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamic.R





class RateFrag : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }

    }

    override fun onStart() {
        super.onStart()
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/EslamAboelze")))
    }




}