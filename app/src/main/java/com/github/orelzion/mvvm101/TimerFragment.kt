package com.github.orelzion.mvvm101

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class TimerFragment : Fragment(R.layout.fragment_timer) {

    private val viewModel by activityViewModels<MainViewModel>()

    companion object {
        @JvmStatic
        fun newInstance() = TimerFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textView)

        viewModel.bindViewData().observe(viewLifecycleOwner, {
            textView.text = it.text
        })
    }
}