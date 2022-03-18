package com.generation.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonD1 = findViewById<Button>(R.id.button)
        val buttonD2 = findViewById<Button>(R.id.button2)
        val buttonD3 = findViewById<Button>(R.id.button3)

        val intentSegunda = Intent (this, MainActivity2::class.java)

        buttonD1.setOnClickListener {
            intentSegunda.putExtra("LADOS", 6)
            startActivity(intentSegunda)
        }

        buttonD2.setOnClickListener {
            intentSegunda.putExtra("LADOS", 12)
            startActivity(intentSegunda)
        }
        buttonD3.setOnClickListener {
            intentSegunda.putExtra("LADOS", 20)
            startActivity(intentSegunda)
        }
    }

        }
