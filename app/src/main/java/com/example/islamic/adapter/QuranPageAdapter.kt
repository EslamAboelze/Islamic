package com.example.islamic.adapter
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.islamic.ui.Quran

private const val NUM_PAGES = 604

class QuranPageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {     //number of pages
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {   //pages which scroll on the view pager
        return Quran(604-position)
    }
}

