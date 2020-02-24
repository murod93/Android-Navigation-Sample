package com.minmax.samplenavigationexample.ui.auth.login

import androidx.lifecycle.LiveData

interface LoginVM {
    val registrationLiveData:LiveData<Unit>
    val resetLiveData:LiveData<Unit>
    val signInLiveData : LiveData<Unit>

    fun registrationButtonClick()

    fun resetButtonClick()

    fun signInButtonClick()
}