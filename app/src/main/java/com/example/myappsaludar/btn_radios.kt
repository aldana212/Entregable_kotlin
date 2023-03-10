package com.example.myappsaludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.Toolbar

class btn_radios : AppCompatActivity() {

    var fieldTxt: EditText? = null
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btn_radios)

        val btnNext: Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener { onClick(1) }

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener { onClick(2) }

    }

    private fun onClick(button: Int) {
        when(button){
            1 -> {
                /* obtenenes y guardamos el nombre*/
                fieldTxt= findViewById(R.id.txtUserName)
                name= fieldTxt!!.text.toString()

                /* comprobamos si el toogle esta activo con condicionales y el isChecked guardamos valor*/
                val toggleBtn:ToggleButton= findViewById(R.id.toggleButton)
                var statusToggle:String = ""
                if (toggleBtn.isChecked) {
                    statusToggle += "Toogle activo"
                } else {
                    statusToggle += "Toogle inactivo"
                }

                /* comprobamos si el switchBtn esta activo con condicionales y el isChecked guardamos valor*/
                val switchBtn:Switch = findViewById(R.id.switch1)
                var statusSwitch:String = ""
                if (switchBtn.isChecked) {
                    statusSwitch += "Switch activo"
                } else {
                    statusSwitch += "Switch inactivo"
                }

                /* comprobamos cual es el CheckBox que esta  activo con condicionales y el isChecked guardamos valor*/
                val checkOne:CheckBox =findViewById(R.id.checkBox)
                val checkTwo:CheckBox =findViewById(R.id.checkBox2)
                var checkResu: String = ""
                if (checkOne.isChecked){
                    checkResu += "Check 1 activo "
                }else{
                    checkResu += "Check 1 inactivo "
                }
                if (checkTwo.isChecked) {
                    checkResu += "Check 2 activo "
                }else{
                    checkResu += "Check 2 inactivo "
                }

                /* comprobamos cual es el RadioButton que esta  activo con condicionales y el isChecked guardamos valor*/
                val radio1:RadioButton =findViewById(R.id.radioButton)
                val radio2:RadioButton =findViewById(R.id.radioButton2)
                var radioResu: String = ""
                if (radio1.isChecked){
                    radioResu += "opcion 1 seleccionada "
                }else{
                    radioResu += "opcion 1 no seleccionada"
                }

                if(radio2.isChecked) {
                    radioResu += "opcion 2 seleccionada "
                }else{
                    radioResu += "opcion 2 no seleccionada"
                }

                val message = "$name, $statusToggle ,$statusSwitch, $checkResu, $radioResu"

                Toast.makeText(this, message , Toast.LENGTH_LONG).show()
            }

             2 ->{
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }

    }
}