package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasQuatro = listOf<Questao>(
    Questao("No máximo 25%", 0),
    Questao("Entre 25,01 e 50%", 2),
    Questao("Acima de 50%", 4)
)