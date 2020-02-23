package com.minmax.samplenavigationexample.ui.auth.login


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.minmax.samplenavigationexample.R

/**
 * Created at
 */
class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel:LoginViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.sign_in_btn).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        view.findViewById<TextView>(R.id.registration_btn).setOnClickListener {

        }
    }
}
