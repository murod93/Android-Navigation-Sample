package com.minmax.samplenavigationexample.ui.auth.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel(), LoginVM{
    private val _registrationLiveData:MutableLiveData<Unit> = MutableLiveData()
    private val _signInLiveData:MutableLiveData<Unit> = MutableLiveData()
    private val _resetLiveData:MutableLiveData<Unit> = MutableLiveData()

    override val registrationLiveData: LiveData<Unit>
        get() = _registrationLiveData
    override val resetLiveData: LiveData<Unit>
        get() = _resetLiveData
    override val signInLiveData: LiveData<Unit>
        get() = _signInLiveData

    override fun registrationButtonClick(){
        _registrationLiveData.postValue(Unit)
    }

    override fun resetButtonClick(){
        _resetLiveData.postValue(Unit)
    }

    override fun signInButtonClick() {
        _signInLiveData.postValue(Unit)
    }

}