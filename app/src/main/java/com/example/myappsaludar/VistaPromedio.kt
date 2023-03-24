package com.example.myappsaludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VistaPromedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_promedio)
        val Nombre:TextView=findViewById(R.id.TextName)
        val Materia:TextView=findViewById(R.id.TextMateria)
        val Nota1:TextView=findViewById(R.id.nota1)
        val Nota2:TextView=findViewById(R.id.nota2)
        val Nota3:TextView=findViewById(R.id.nota3)
        val Promedio:TextView=findViewById(R.id.textPromedio)
        val Result:TextView=findViewById(R.id.textResult)


        // recuperamos o capturamos la infomacion enviada
        val miBundle:Bundle ?= this.intent.extras

        // se valida si el dato viene vacio o no
        // y a cada textView le datos su respectivo valor
        if (miBundle != null){
            Nombre.text = "${miBundle.getString("nombre")}"
            Materia.text = "${miBundle.getString("materia")}"
            Nota1.text = "${miBundle.getString("nota1")}"
            Nota2.text = "${miBundle.getString("nota2")}"
            Nota3.text = "${miBundle.getString("nota3")}"
            Promedio.text = "${miBundle.getString("promedio")}"
            Result.text = "${miBundle.getString("Resultado")}"
        }else{

        }
        val botonSalir:Button=findViewById(R.id.button2)
        botonSalir.setOnClickListener { onclick() }
    }

    private fun onclick() {
        finish()
    }
}