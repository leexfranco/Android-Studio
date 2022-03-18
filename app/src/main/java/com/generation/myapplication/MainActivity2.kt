package com.generation.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val lados = intent.getIntExtra("LADOS", 0)
        val text6 = findViewById<TextView>(R.id.text6)
        val buttonD4 = findViewById<Button>(R.id.buttonD4)


        text6.text = "D$lados"


        buttonD4.setOnClickListener {
            rolarDados(6)
        }

    }

        private fun rolarDados(lados: Int) {
            val valor = (1..lados).random()
            val text6 = findViewById<TextView>(R.id.text6)
            text6.text = valor.toString()


            /*val imageView = imgD1(valor)
        val imageDado6 = findViewById<ImageView>(R.id.imageDado6)
        imageDado6.setImageResource(imageResource)



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
    }*/
        }

}