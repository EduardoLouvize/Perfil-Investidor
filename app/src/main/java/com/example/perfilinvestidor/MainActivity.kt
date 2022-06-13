package com.example.perfilinvestidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIniciar = this.findViewById<Button>(R.id.btnIniciar)
        btnIniciar.setOnClickListener {
            iniciarTeste()
        }
    }


    private fun iniciarTeste() {
        val txtNome = this.findViewById<EditText>(R.id.txtNome).text.toString()
        val intent = Intent(this, PerguntasActivity::class.java).apply {
            putExtra("nome", txtNome)
        }
        startActivity(intent)
    }
}