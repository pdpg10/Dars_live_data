package com.example.dars_live_data

import androidx.lifecycle.MutableLiveData

class Task(
    private val liveData
    : MutableLiveData<String>)
    : Thread() {

    override fun run() {
        super.run()
        for (it in 0..100) {
            sleep(100)
            liveData.postValue("count:$it")
        }
    }
}