package com.github.orelzion.mvvm101

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [ResetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResetFragment : Fragment(R.layout.fragment_reset) {

    companion object {
        @JvmStatic
        fun newInstance() = ResetFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}