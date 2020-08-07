package com.devzamse.android.kotlin_temple.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.devzamse.android.kotlin_temple.MainActivity
import com.devzamse.android.kotlin_temple.R
import com.devzamse.android.kotlin_temple.view.test.test

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val i: Intent = Intent(this, MainActivity::class.java)
//            val i: Intent = Intent(this, test::class.java)
            i.putExtra("nombre","test")
            startActivity(i)
        },500)

    }
}
