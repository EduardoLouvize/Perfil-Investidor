package com.example.perfilinvestidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.perfilinvestidor.fragments.vewModel.SharedViewModel


class PerguntasActivity : AppCompatActivity() {

    private val nomeUsuario: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        nomeUsuario.selectString(intent.getStringExtra("nome"))

        Log.i("TAG", "onCreate PerguntasActivity: ${nomeUsuario.selectedString.value}")

    }

}