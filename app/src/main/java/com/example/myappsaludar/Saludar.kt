package com.example.myappsaludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class Saludar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludar)

        val btnIngresa: Button= findViewById(R.id.btnIngresar)
        btnIngresa.setOnClickListener { ingresarNombre() }

        val btnRegresar: Button=findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener { Regresar() }
    }

    private fun Regresar() {
        val intent :Intent= Intent(this, Home::class.java)
        startActivity(intent)
    }

    private fun ingresarNombre() {
        // val lblNombre:TextView=findViewById(R.id.)
        val campoNombre: EditText = findViewById(R.id.txtNombre)
        var Nombre = campoNombre.text
        // lblNombre.text = Nombre
        Toast.makeText(this, "Bienvenido $Nombre", Toast.LENGTH_LONG).show()

    }
}