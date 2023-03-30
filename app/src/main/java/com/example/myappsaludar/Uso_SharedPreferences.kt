package com.example.myappsaludar

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class Uso_SharedPreferences : AppCompatActivity() {
    var  campoUsuario: EditText?=null;
    var campoPass:EditText?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uso_shared_preferences)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
       var BtnGuardar:Button= findViewById(R.id.BtnGuardar)
        BtnGuardar.setOnClickListener { datos(1) }
        var BtnCargar:Button= findViewById(R.id.BtnCargar)
        BtnCargar.setOnClickListener { datos(2) }

        campoUsuario= findViewById(R.id.campoUser)
        campoPass= findViewById(R.id.Pass)
    }

    private fun datos(btn:Int){

       when(btn){
           1 ->{
               //creamos las preferencias
               var preferences:SharedPreferences=getSharedPreferences("credenciales",Context.MODE_PRIVATE)
               var usuario=campoUsuario?.text.toString()
               var pass = campoPass?.text.toString()

               //decimos que vamos a editar el archivo
               var editor:SharedPreferences.Editor=preferences.edit()
               editor.putString("user", usuario)
               editor.putString("pass", pass)

               //confirmamos el almacenamiento
               editor.commit()

               Toast.makeText(this,"Se han registrado los datos",Toast.LENGTH_SHORT).show()
           }
           2 ->{
               var intent:Intent= Intent(this, Vista_uso_SharedPreferences::class.java)
               startActivity(intent)
           }
       }

    }
}