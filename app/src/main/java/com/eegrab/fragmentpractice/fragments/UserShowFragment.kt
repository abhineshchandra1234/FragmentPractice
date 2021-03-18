package com.eegrab.fragmentpractice.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eegrab.fragmentpractice.R
import com.eegrab.fragmentpractice.databinding.FragmentUserShowBinding


class UserShowFragment : Fragment(R.layout.fragment_user_show) {

    private lateinit var binding: FragmentUserShowBinding
    var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_user_show, container, false)
        binding = FragmentUserShowBinding.bind(view)

        displayMessage = arguments?.getString("username")

        binding.tvUserName.text = displayMessage

        return view

    }

}