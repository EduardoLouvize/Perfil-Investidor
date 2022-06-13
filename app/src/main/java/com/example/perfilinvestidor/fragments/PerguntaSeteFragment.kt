package com.example.perfilinvestidor.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.perfilinvestidor.R
import com.example.perfilinvestidor.mock.respostasSete

class PerguntaSeteFragment : Fragment() {

    var indexPontuacao = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pergunta_sete, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val radioButton = view.findViewById<RadioButton>(R.id.radioButton)
        val radioButton1 = view.findViewById<RadioButton>(R.id.radioButton2)
        val radioButton2 = view.findViewById<RadioButton>(R.id.radioButton3)
        val radioButton3 = view.findViewById<RadioButton>(R.id.radioButton4)
        val questoes = listOf(
            radioButton, radioButton1, radioButton2, radioButton3
        )

        val pontuacaoAtualLista = mutableListOf<Int>()

        for (i in respostasSete.indices) {

            questoes[i].text = respostasSete[i].resposta
            pontuacaoAtualLista.add(respostasSete[i].pontuacao)

        }

        val radioButtonGroup = view.findViewById<RadioGroup>(R.id.radioGroupSete)
        radioButtonGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                indexPontuacao = 0
            } else if (checkedId == R.id.radioButton2) {
                indexPontuacao = 1
            } else if (checkedId == R.id.radioButton3) {
                indexPontuacao = 2
            } else if (checkedId == R.id.radioButton4) {
                indexPontuacao = 3
            }

        }

        val btnAvancar = view.findViewById<Button>(R.id.btnAvancar)
        btnAvancar.setOnClickListener {
            val safeArgs: PerguntaSeteFragmentArgs by navArgs()
            val pontuacaoAtual = safeArgs.pontuacaoFinal + pontuacaoAtualLista[indexPontuacao]
            Log.i("TAG", "onViewCreated 7: $pontuacaoAtual")
            val action = PerguntaSeteFragmentDirections.actionPerguntaSeteFragmentToPerguntaOitoFragment(
                pontuacaoAtual
            )
            findNavController().navigate(action)
        }

    }

}