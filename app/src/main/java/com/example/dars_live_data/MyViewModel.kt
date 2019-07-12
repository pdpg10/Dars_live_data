package com.example.dars_live_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val liveData: MutableLiveData<String> = MutableLiveData()
    private val task = Task(liveData)
    private var isStarted = false

    fun onStartTask(): LiveData<String> {
        if (!isStarted) {
            task.start()
            isStarted = true
        }
        return liveData
    }
}
