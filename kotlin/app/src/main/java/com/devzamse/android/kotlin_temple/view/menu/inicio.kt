package com.devzamse.android.kotlin_temple.view.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import com.devzamse.android.kotlin_temple.R
import com.devzamse.android.kotlin_temple.utils.ChangeFragment
import com.devzamse.android.kotlin_temple.view.info.Informacion

/**
 * A simple [Fragment] subclass.
 */
class inicio : Fragment() {

    private lateinit var buton: Button
    private lateinit var textView: TextView
    private lateinit var animacion: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_inicio, container, false)

        buton = view.findViewById(R.id.navegar)
        textView = view.findViewById(R.id.textView)
        animacion = view.findViewById(R.id.animacion)

        ClickFunction()

        return view
    }

    private fun ClickFunction() {
        buton.setOnClickListener {
            ChangeFragment(Informacion(), activity!!.supportFragmentManager)
        }

        textView.setOnClickListener {
            animacion.visibility = View.GONE
        }
    }

}
