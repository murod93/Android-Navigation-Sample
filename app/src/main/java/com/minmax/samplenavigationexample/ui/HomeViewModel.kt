package com.minmax.samplenavigationexample.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel:ViewModel(){
    private val _openSettings:MutableLiveData<Unit> = MutableLiveData()
    private val _openAbout:MutableLiveData<Unit> = MutableLiveData()

    val openSettings:LiveData<Unit> = _openSettings
    val openAbout:LiveData<Unit> = _openAbout
}