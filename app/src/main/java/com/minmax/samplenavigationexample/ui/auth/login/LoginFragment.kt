package com.minmax.samplenavigationexample.ui.auth.login


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.minmax.samplenavigationexample.R

/**
 * Created at 2020.02.23
 * @author Murodjon
 */
class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel:LoginViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.sign_in_btn).setOnClickListener {
            viewModel.signInButtonClick()
        }

        view.findViewById<TextView>(R.id.registration_btn).setOnClickListener {
            viewModel.registrationButtonClick()
        }

        view.findViewById<TextView>(R.id.reset_btn).setOnClickListener{
            viewModel.resetButtonClick()
        }

        viewModel.registrationLiveData.observe(viewLifecycleOwner, registrationObserver)
        viewModel.resetLiveData.observe(viewLifecycleOwner, resetObserver)
        viewModel.signInLiveData.observe(viewLifecycleOwner, signInObserver)
    }

    private val registrationObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_loginFragment_to_registration)
    }

    private val resetObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }

    private val signInObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }
}
