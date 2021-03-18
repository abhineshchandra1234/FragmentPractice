package com.eegrab.fragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eegrab.fragmentpractice.fragments.UserEntryFragment
import com.eegrab.fragmentpractice.fragments.UserShowFragment

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val UserEntryFragment = UserEntryFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,UserEntryFragment).commit()
    }

    override fun passUserData(etUserText: String) {
            val bundle = Bundle()
            bundle.putString("username",etUserText)

        val transaction = this.supportFragmentManager.beginTransaction()
        val UserShowFragment = UserShowFragment()
        UserShowFragment.arguments = bundle

        transaction.replace(R.id.fragmentContainer,UserShowFragment)
        transaction.commit()
    }
}