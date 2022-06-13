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
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.perfilinvestidor.R
import com.example.perfilinvestidor.fragments.vewModel.SharedViewModel
import com.example.perfilinvestidor.mock.respostasNove

class PerguntaNoveFragment : Fragment() {

    var indexPontuacao = 0
    private val nomeUsuario: SharedViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pergunta_nove, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val radioButton = view.findViewById<RadioButton>(R.id.radioButton)
        val radioButton1 = view.findViewById<RadioButton>(R.id.radioButton2)
        val radioButton2 = view.findViewById<RadioButton>(R.id.radioButton3)
        val radioButton3 = view.findViewById<RadioButton>(R.id.radioButton4)
        val radioButton4 = view.findViewById<RadioButton>(R.id.radioButton5)
        val questoes = listOf(
            radioButton, radioButton1, radioButton2, radioButton3, radioButton4
        )

        val pontuacaoAtualLista = mutableListOf<Int>()

        for (i in respostasNove.indices) {

            questoes[i].text = respostasNove[i].resposta
            pontuacaoAtualLista.add(respostasNove[i].pontuacao)

        }

        val radioButtonGroup = view.findViewById<RadioGroup>(R.id.radioGroupNove)
        radioButtonGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                indexPontuacao = 0
            } else if (checkedId == R.id.radioButton2) {
                indexPontuacao = 1
            } else if (checkedId == R.id.radioButton3) {
                indexPontuacao = 2
            } else if (checkedId == R.id.radioButton4) {
                indexPontuacao = 3
            } else if (checkedId == R.id.radioButton5) {
                indexPontuacao = 4
            }

        }

        val btnAvancar = view.findViewById<Button>(R.id.btnAvancar)
        btnAvancar.setOnClickListener {
            val safeArgs: PerguntaNoveFragmentArgs by navArgs()
            val pontuacaoAtual = safeArgs.pontuacaoFinal + pontuacaoAtualLista[indexPontuacao]
            val nomeUsuario = nomeUsuario.selectedString.value
            Log.i("TAG", "onViewCreated 9: pontuacaoAtualLista = ${pontuacaoAtual} / nomeUsuario = ${nomeUsuario}")
            val action = PerguntaNoveFragmentDirections.actionPerguntaNoveFragmentToResultadoActivity(
                pontuacaoAtual,
                nomeUsuario.toString()
            )
            findNavController().navigate(action)
        }

    }

}