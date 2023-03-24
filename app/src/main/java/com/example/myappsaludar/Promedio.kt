package com.example.myappsaludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Promedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)

        val btnPromedio: Button = findViewById(R.id.Calcurar)
        btnPromedio.setOnClickListener { promedio(1) }

        val btnRegresar: Button  = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener { promedio(2) }

    }

    private fun promedio(btn:Int) {
        when(btn){
            1 ->{
                val campoNombre: EditText = findViewById(R.id.TextName)
                val nombre = campoNombre.text
                val campoMateria: EditText = findViewById(R.id.TextMateria)
                val materia = campoMateria.text
                val campoNota1: EditText = findViewById(R.id.TextNumber)
                val nota1:Double = campoNota1.text.toString().toDouble()
                val campoNota2: EditText = findViewById(R.id.TextNumber2)
                val nota2:Double = campoNota2.text.toString().toDouble()
                val campoNota3: EditText = findViewById(R.id.TextNumber3)
                val nota3:Double = campoNota3.text.toString().toDouble()
                var Promedio = (nota1 + nota2 + nota3) / 3;
                var Resultado= ""

                if (Promedio >= 3.0){
                    Resultado = "Aprobo"
                }else{
                    Resultado = "Desaprobo"
                }

                // cargamos el intent que se encarga de la comunicacion de las actividades
                val intentver: Intent = Intent(this, VistaPromedio::class.java)
                // cargamos el Bundle para el intercambio entre las actividades
                val miBundle:Bundle =Bundle()
                miBundle.putString("nombre", "$nombre")
                miBundle.putString("materia", "$materia")
                miBundle.putString("nota1", "$nota1")
                miBundle.putString("nota2", "$nota2 ")
                miBundle.putString("nota3", "$nota3")
                miBundle.putString("promedio", "$Promedio")
                miBundle.putString("Resultado", "$Resultado")
                // le agragamos la informacion al Intent para que sea enviada
                intentver.putExtras(miBundle)
                // iniciamos la llamada de la nueva actividad
                startActivity(intentver)

            }
            2 ->{
                val intentRegresar: Intent = Intent(this, Home::class.java)
                startActivity(intentRegresar)
            }
        }
    }
}
