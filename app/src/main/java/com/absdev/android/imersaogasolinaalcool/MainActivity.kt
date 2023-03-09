package com.absdev.android.imersaogasolinaalcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular( view: View){

        val editAlcool = findViewById<EditText>(R.id.edit_alcool)
        val editGasolina = findViewById<EditText>(R.id.edit_gasolina)
        val textResultado = findViewById<TextView>(R.id.text_resultado)

        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        if (precoAlcool.isNotEmpty() && precoGasolina.isNotEmpty()){
            val pAlcool = precoAlcool.toDouble()
            val pGasolina = precoGasolina.toDouble()
            val resultado = pAlcool / pGasolina

            if (resultado >= 0.7) {
                textResultado.text = "É melhor usar Gasolina"
            } else {
                textResultado.text = "É melhor usar Álcool"
            }

        } else {
                textResultado.text = "Entre com os preços do Álcool e Gasolina"
        }
    }
}