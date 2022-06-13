package com.example.perfilinvestidor.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.perfilinvestidor.R
import com.example.perfilinvestidor.mock.respostasUm

class PerguntaUmFragment : Fragment() {

    var indexPontuacao = 0
    var pontuacaoFinal = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta_um, container, false)
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

        for (i in respostasUm.indices) {

            questoes[i].text = respostasUm[i].resposta
            pontuacaoAtualLista.add(respostasUm[i].pontuacao)
        }

        val radioButtonGroup = view.findViewById<RadioGroup>(R.id.radioGroupUm)
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
            Log.i("TAG", "onViewCreated: pontuacaoAtualLista = ${pontuacaoAtualLista[indexPontuacao]} / selectedRadioId = ${group} ")
            Toast.makeText(context, "Potunação atual: ${pontuacaoAtualLista[indexPontuacao]}", Toast.LENGTH_SHORT).show()
        }

        val btnAvancar = view.findViewById<Button>(R.id.btnAvancar)
        btnAvancar.setOnClickListener {
            pontuacaoFinal += pontuacaoAtualLista[indexPontuacao]
            val action = PerguntaUmFragmentDirections.actionPerguntaUmFragmentToPerguntaDoisFragment(pontuacaoFinal)
            findNavController().navigate(action)
        }
    }


}