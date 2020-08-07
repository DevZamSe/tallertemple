package com.devzamse.android.kotlin_temple.view.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.devzamse.android.kotlin_temple.R

class test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        Log.e("está actividad", "si entro")
        val texto: String = intent.getStringExtra("nombre")
        Log.e("el texto es:", texto)
    }
}
