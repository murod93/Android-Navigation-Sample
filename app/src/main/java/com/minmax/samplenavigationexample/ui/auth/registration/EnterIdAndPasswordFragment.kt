package com.minmax.samplenavigationexample.ui.auth.registration


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.minmax.samplenavigationexample.R

/**
 * A simple [Fragment] subclass.
 */
class EnterIdAndPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_id_and_password, container, false)
    }


}
