package com.devzamse.android.kotlin_temple.view.info

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

import com.devzamse.android.kotlin_temple.R

/**
 * A simple [Fragment] subclass.
 */
class Informacion : Fragment() {

    private lateinit var redesSociales: Button
    private lateinit var mensaje: EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_informacion, container, false)

        redesSociales = view.findViewById(R.id.redesSociales)
        mensaje = view.findViewById(R.id.mensaje)

        clickMethod()

        return view
    }

    private fun clickMethod() {
        redesSociales.setOnClickListener {
//            val intent = Intent(Intent.ACTION_SEND)
//            val contenido: String = mensaje.text.toString()
//            intent.type = "text/plain"
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Compartir")
//            intent.putExtra(Intent.EXTRA_TEXT, contenido)
//            startActivity(Intent.createChooser(intent, "Desarrollo en el taller de academia temple"))
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel: 9999"))
            startActivity(intent)

        }
    }

}
