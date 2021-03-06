package com.away0x.ppjoke.ui.fragments.sofa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.away0x.lib_annotation.FragmentDestination
import com.away0x.lib_common.utils.logd

import com.away0x.ppjoke.R

@FragmentDestination(pageUrl = "main/tabs/sofa")
class SofaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        logd("SofaFragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_sofa, container, false)
    }

}
