package com.example.dars_live_data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private var c = 0
    private val liveData by lazy { MutableLiveData<String>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        liveData.observe(this, Observer { tv.text = it })


        fab.setOnClickListener {
            liveData.value = "News-${c++}"//from ui thread
//            liveData.postValue("News-${c++}")//non ui thread
        }
    }
}
