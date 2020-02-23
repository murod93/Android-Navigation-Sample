package com.minmax.samplenavigationexample.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashViewModel : ViewModel(){

    enum class AuthState {
        UNAUTHENTICATED, // Initial state, the user needs to authenticate
        AUTHENTICATED, // The user has authenticated successfully
    }

    private val _authState = MutableLiveData<AuthState>()
    val authState:LiveData<AuthState> = _authState

    init {
        _authState.value = AuthState.AUTHENTICATED
    }
}