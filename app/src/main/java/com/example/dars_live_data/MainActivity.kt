package com.example.dars_live_data

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

//todo mutableLivedata vs livedata

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val myViewModel = ViewModelProviders.of(this)
            .get(MyViewModel::class.java)


        val liveData = myViewModel.onStartTask()
        Log.d("MainActivity", "oncreate hashCode:${myViewModel.hashCode()}")
        liveData.observe(this, Observer { tv.text = it })
    }
}
