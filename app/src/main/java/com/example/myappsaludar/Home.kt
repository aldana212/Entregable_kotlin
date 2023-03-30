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
        boton1.setOnClickListener { handleViews(1) }

        val boton2: Button = findViewById(R.id.btnIngresar1)
        boton2.setOnClickListener { handleViews(2) }

        val boton3: Button = findViewById(R.id.btnIngresar3)
        boton3.setOnClickListener { handleViews(3) }

        var boton4: Button = findViewById(R.id.btnIngresar4)
        boton4.setOnClickListener { handleViews(4) }

        var boton5: Button = findViewById(R.id.btnIngresar5)
        boton5.setOnClickListener { handleViews(5) }
    }

    private fun handleViews(btn: Int) {
       when(btn){
           1 ->{
               /*Intent es un objeto que se utiliza para iniciar una actividad o para enviar y recibir información entre actividades.*/
               val intent: Intent = Intent(this, Saludar:: class.java)
               /* Llamar al método startActivity() y pasar el Intent como parámetro: y iniciara la actividad */
               startActivity(intent)
           }
           2 ->{
               /*Intent es un objeto que se utiliza para iniciar una actividad o para enviar y recibir información entre actividades.*/
               val intent: Intent = Intent(this, btn_radios:: class.java)
               /* Llamar al método startActivity() y pasar el Intent como parámetro: y iniciara la actividad */
               startActivity(intent)
           }
           3 ->{
               val intentPromedio: Intent = Intent(this, Promedio:: class.java)
               startActivity(intentPromedio)
           }
           4 ->{
               var intentLogin: Intent = Intent(this, Uso_SharedPreferences::class.java )
               startActivity(intentLogin)
           }
           5 ->{
               var intentLogin: Intent = Intent(this, cicloVida::class.java )
               startActivity(intentLogin)
           }
       }
    }
}