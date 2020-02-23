package com.minmax.samplenavigationexample.ui.splash


import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController

import com.minmax.samplenavigationexample.R


/**
 * A simple [Fragment] subclass.
 */
class SplashFragment : Fragment(R.layout.fragment_splash) {

    private val viewModel: SplashViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        Handler().postDelayed({
            viewModel.authState.observe(viewLifecycleOwner, Observer {authState->
                when(authState!!){
                    SplashViewModel.AuthState.AUTHENTICATED->
                        navController.navigate(R.id.action_splashFragment_to_homeFragment)
                    SplashViewModel.AuthState.UNAUTHENTICATED->
                        navController.navigate(R.id.action_splashFragment_to_loginFragment)
                }
            })
        }, 2000)

    }
}
