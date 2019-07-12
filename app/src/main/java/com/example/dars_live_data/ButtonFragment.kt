package com.example.dars_live_data


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_button.*

class ButtonFragment : Fragment() {
    private var c = 0
    val viewModel by lazy { ViewModelProviders.of(activity!!).get(MyViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            updateCounter()
        }
    }

    private fun updateCounter() {
        Log.d("onViewCreated", "hash:${viewModel.hashCode()}")
        viewModel.updateText("counter:${c++}")
    }
}
