package com.example.dars_live_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val liveData: MutableLiveData<String> = MutableLiveData()

    fun updateText(text: String) {
        liveData.value = text
    }

    fun getLiveData(): LiveData<String> = liveData


}
