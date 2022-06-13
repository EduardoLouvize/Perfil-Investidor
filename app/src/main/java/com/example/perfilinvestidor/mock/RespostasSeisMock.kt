package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasSeis = listOf<Questao>(
    Questao("Meu patrimônio não está aplicado ou está todo aplicado em renda fixa e/ou imóveis", 0),
    Questao("Menos de 25% em renda variável e o restante em renda fixa e/ou imóveis", 2),
    Questao("Entre 25,01 e 50% aplicado em renda variável e o restante em renda fixa e/ou imóveis", 3),
    Questao("Acima de 50% em renda variável", 4)
)