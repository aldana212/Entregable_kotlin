package com.example.myappsaludar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class cicloVida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        Log.i("ClicloVida", "Ingresa a onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ClicloVida", "Ingresa a onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ClicloVida", "Ingresa a onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ClicloVida", "Ingresa a onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ClicloVida", "Ingresa a onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ClicloVida", "Ingresa a onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ClicloVida", "Ingresa a onDestroy()")
    }
}