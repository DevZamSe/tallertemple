package com.devzamse.android.kotlin_temple.view.test

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.devzamse.android.kotlin_temple.R

class test : AppCompatActivity() {

    private lateinit var dialog: Dialog
    private lateinit var dialogTexto: String
    private lateinit var textView5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        textView5 = findViewById(R.id.textView5)

        configInicial()
        inflarDialog()
    }

    private fun inflarDialog() {
//        Handler().postDelayed({
            dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_question)
            dialog.setCancelable(false)
            dialog.show()

        var a: EditText = dialog.findViewById(R.id.editText)
        var b: Button = dialog.findViewById(R.id.button)

        b.setOnClickListener{
//            Log.e("dialog Resultado", a.text.toString())
            dialogTexto = a.text.toString()
            textView5.text = dialogTexto
            dialog.dismiss()
        }

//        },500)
    }

    private fun configInicial() {
        Log.e("está actividad", "si entro")
        val texto: String = intent.getStringExtra("nombre")
        Log.e("el texto es:", texto)
    }
}
