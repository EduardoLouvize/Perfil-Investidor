package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasOito = listOf<Questao>(
    Questao("Até R$ 1.000", 0),
    Questao("De R$ 1.001 até R$ 5.000", 1),
    Questao("De R$ 5.001 até R$ 10.000", 2),
    Questao("Acima de R$ 10.000", 4)
)