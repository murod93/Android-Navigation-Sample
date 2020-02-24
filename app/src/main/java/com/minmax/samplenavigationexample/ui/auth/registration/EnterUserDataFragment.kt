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
class EnterUserDataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // If the user presses back, cancel the user registration and pop back
        // to the login fragment. Since this ViewModel is shared at the activity
        // scope, its state must be reset so that it will be in the initial
        // state if the user comes back to register later.
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
//            registrationViewModel.userCancelledRegistration()
//            navController.popBackStack(R.id.login_fragment, false)
//        })
//
//        https://developer.android.com/guide/navigation/navigation-conditional
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_user_data, container, false)
    }


}
