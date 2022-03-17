package com.generation.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD1 = findViewById<Button>(R.id.button)
        val buttonD2 = findViewById<Button>(R.id.button2)
        val buttonD3 = findViewById<Button>(R.id.button3)

        buttonD1.setOnClickListener {
            rolarDados (6)
        }
        buttonD2.setOnClickListener {
            rolarDados(12)
        }
        buttonD3.setOnClickListener {
            rolarDados(20)
        }
    }
    private fun  rolarDados (lados :  Int ){
        val valor = ( 1 .. lados).random()
        val textResultado = findViewById<TextView>(R .id.textResultado)
        textResultado.text = valor.toString()
        val imageResource = imgD1(valor)
        val imageDado = findViewById<ImageView>(R .id.imageDado)
        imageDado.setImageResource(imageResource)

    }

    private fun imgD1(valor: Int): Int{
        return when(valor){
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            6 -> R.drawable.dado6
            else -> R.drawable.numero
        }
    }
}