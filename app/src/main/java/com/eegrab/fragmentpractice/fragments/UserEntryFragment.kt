package com.eegrab.fragmentpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eegrab.fragmentpractice.Communicator
import com.eegrab.fragmentpractice.R
import com.eegrab.fragmentpractice.databinding.FragmentUserEntryBinding


class UserEntryFragment : Fragment(R.layout.fragment_user_entry) {

    private lateinit var binding: FragmentUserEntryBinding
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_entry, container, false)
        binding = FragmentUserEntryBinding.bind(view)

        communicator = activity as Communicator

        binding.btnSendData.setOnClickListener {
            communicator.passUserData(binding.etUserName.text.toString())
        }

        return view
    }


}