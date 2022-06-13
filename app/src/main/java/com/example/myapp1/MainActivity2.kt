package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val txtnbr = findViewById<TextView>(R.id.txtResNombre)
        val txtdat = findViewById<TextView>(R.id.txtResFecha)
        val rbutonFeme = findViewById<RadioButton>(R.id.rbResFemenino)
        val rbutonMasc = findViewById<RadioButton>(R.id.rbResMasculino)
        val txtcellPh = findViewById<TextView>(R.id.txtResTelefono)

        if (bundle != null) {
            txtnbr.setText(bundle.getString("nbr"))
            txtdat.setText(bundle.getString("date"))
            rbutonFeme.isChecked=bundle.getBoolean("femeni")
            rbutonMasc.isChecked=bundle.getBoolean("masculi")
            txtcellPh.setText(bundle.getString("cel"))
        }

    }
    fun botonSalir(view: View){
        onBackPressed();
    }
}