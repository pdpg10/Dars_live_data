package com.example.dars_live_data

import java.util.*

class News : Observable() {
    fun publish(news: String) {
        setChanged()
        notifyObservers(news)
    }
}