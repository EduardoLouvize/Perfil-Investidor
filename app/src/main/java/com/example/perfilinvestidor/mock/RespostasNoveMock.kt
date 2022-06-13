package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasNove = listOf<Questao>(
    Questao("Até R$ 10.000", 0),
    Questao("De R$ 10.001 até R$ 100.000", 1),
    Questao("De R$ 100.001 até R$ 500.000", 2),
    Questao("De R$ 500.001 até R$ 1.000.000", 4),
    Questao("Acima de R$ 1.000.001", 5)
)