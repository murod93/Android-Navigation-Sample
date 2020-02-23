package com.minmax.samplenavigationexample.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.minmax.samplenavigationexample.R
import com.minmax.samplenavigationexample.ui.home.HomeViewModel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(R.layout.fragment_home) {

    val viewModel: HomeViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.openAbout.observe(viewLifecycleOwner, Observer {

        })

        viewModel.openSettings.observe(viewLifecycleOwner, Observer {

        })
    }
}
