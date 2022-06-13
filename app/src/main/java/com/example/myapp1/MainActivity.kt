package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun botonEnviar(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtFecha = findViewById<EditText>(R.id.txtFecha)
        val rbFem = findViewById<RadioButton>(R.id.rbFemenino)
        val rbMasc = findViewById<RadioButton>(R.id.rbMasculino)
        val txtTelefono = findViewById<EditText>(R.id.txtTelefono)

        intent.putExtra("nbr", txtNombre.text.toString())
        intent.putExtra("date", txtFecha.text.toString())
        intent.putExtra("femeni", rbFem.isChecked)
        intent.putExtra("masculi", rbMasc.isChecked)
        intent.putExtra("cel", txtTelefono.text.toString())
        startActivity(intent)
    }
}