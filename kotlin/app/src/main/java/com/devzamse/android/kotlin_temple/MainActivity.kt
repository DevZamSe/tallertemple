package com.devzamse.android.kotlin_temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.devzamse.android.kotlin_temple.view.menu.inicio

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConfigInicial()

    }

    private fun ConfigInicial() {
        val window: Window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(baseContext, R.color.rojo)
        window.navigationBarColor = ContextCompat.getColor(baseContext, R.color.rojo)

        supportFragmentManager.beginTransaction().replace(R.id.frame, inicio()).commit()
    }
}
