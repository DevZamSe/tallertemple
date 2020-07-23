package com.devzamse.android.kotlin_temple.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.devzamse.android.kotlin_temple.R

fun ChangeFragment(fragmentChange: Fragment, supportFragmentManager: FragmentManager){
    val frag: Fragment = fragmentChange
    val fragMan: FragmentManager = supportFragmentManager

    val fragTran: FragmentTransaction = fragMan.beginTransaction()
    fragTran.replace(R.id.frame, frag)
    fragTran.addToBackStack(null)
    fragTran.commit()

}