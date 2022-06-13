package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasUm = listOf<Questao>(
    Questao("Menos de 6 meses", 0),
    Questao("Entre 6 meses e 1 ano", 2),
    Questao("Entre 1 ano e 3 anos", 3),
    Questao("Acima de 3 anos", 4)
)