package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasTres = listOf<Questao>(
    Questao("Não possuo formação acadêmica ou conhecimento do mercado financeiro", 0),
    Questao("Possuo formação acadêmica na área financeira, mas não tenho experiência com o mercado financeiro", 1),
    Questao("Possuo formação acadêmica em outra área, mas possuo conhecimento do mercado financeiro", 2),
    Questao("Possuo formação acadêmica na área financeira ou pleno conhecimento do mercado financeiro", 4)
)