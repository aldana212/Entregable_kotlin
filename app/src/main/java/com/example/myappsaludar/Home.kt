package com.example.myappsaludar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton1: Button = findViewById(R.id.btnIngresar)
        boton1.setOnClickListener { HomeSaludar() }

        val boton2: Button = findViewById(R.id.btnIngresar1)
        boton2.setOnClickListener { homeRadio() }
    }

    private fun homeRadio() {
        /*Intent es un objeto que se utiliza para iniciar una actividad o para enviar y recibir información entre actividades.*/
        val intent: Intent = Intent(this, btn_radios:: class.java)
        /* Llamar al método startActivity() y pasar el Intent como parámetro: y iniciara la actividad */
        startActivity(intent)
    }

    private fun HomeSaludar() {
        /*Intent es un objeto que se utiliza para iniciar una actividad o para enviar y recibir información entre actividades.*/
        val intent: Intent = Intent(this, Saludar:: class.java)
        /* Llamar al método startActivity() y pasar el Intent como parámetro: y iniciara la actividad */
        startActivity(intent)
    }
}