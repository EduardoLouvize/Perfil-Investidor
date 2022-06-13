package com.example.perfilinvestidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.example.perfilinvestidor.fragments.PerguntaNoveFragmentArgs
import com.example.perfilinvestidor.fragments.PerguntaSeteFragmentArgs

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val safeArgs: PerguntaNoveFragmentArgs by navArgs()
        val pontuacaoAtual = safeArgs.pontuacaoFinal
        val txtNome = safeArgs.nomeUsuario

        Log.i("TAG", "onCreate: ${pontuacaoAtual}")
        Log.i("TAG", "onCreate: ${txtNome}")

        val lblNome = findViewById<TextView>(R.id.lblNome)
        lblNome.text = txtNome

        val lblPerfilInvestidor = findViewById<TextView>(R.id.lblPerfilInvestidor)
        if (pontuacaoAtual <= 12) {
            lblPerfilInvestidor.text = getString(R.string.perfil_conservador)
        } else if (pontuacaoAtual in 13..29) {
            lblPerfilInvestidor.text = getString(R.string.perfil_moderado)
        } else {
            lblPerfilInvestidor.text = getString(R.string.perfil_arrojado)
        }

    }
}