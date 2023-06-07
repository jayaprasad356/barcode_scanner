package com.vibame.barcodescanner.feature.tabs.history

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.vibame.barcodescanner.R

class BarcodeHistoryViewPagerAdapter(context: Context, fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    private val pageTitles = context.resources.getStringArray(R.array.fragment_barcode_history_tab_titles)

    override fun getCount(): Int {
        return 1
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageTitles[position]
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> BarcodeHistoryListFragment.newInstanceAll()
            else -> throw IllegalArgumentException("No fragment for position other than 0")
        }
    }

}