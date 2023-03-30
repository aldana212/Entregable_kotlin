package com.example.myappsaludar

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Vista_uso_SharedPreferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_uso_shared_preferences)
        cargarDatos()
    }

    private fun cargarDatos() {
        // variables para guardar un valor y mostrar en la vista
        var txtUser: TextView=findViewById(R.id.TxtUser);
        var txtPass:TextView=findViewById(R.id.TxtPass);

        //creamos las preferencias
        var preferences: SharedPreferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        // guardo los datos de SharedPreferences en variables
        var user: String?= preferences.getString("user","No existe la información")
        var pass: String?= preferences.getString("pass","No existe la información")


        txtUser?.text = user;
        txtPass?.text = pass;

        // para pasar por las actividades
        var btnLogin: Button = findViewById(R.id.BtnLogin)
        btnLogin.setOnClickListener { handleIntent(1) }
        var btnHome: Button = findViewById(R.id.BtnHome)
        btnHome.setOnClickListener { handleIntent(2)}
    }

    private fun handleIntent(btn:Int) {
        when(btn){
            1 ->{
                var intent :Intent = Intent(this, Uso_SharedPreferences::class.java)
                startActivity(intent)
            }
            2->{
                var intent: Intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }
    }
}