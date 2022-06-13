package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasSete = listOf<Questao>(
    Questao("Conto com o rendimento dessas aplicações para complementar minha renda mensal", 0),
    Questao(
        "Eventualmente posso resgatar parte das aplicações para fazer frente aos meus gastos. Contudo, não tenho" +
                " intenção de resgatar no curto prazo e pretendo fazer aplicações regulares",
        2
    ),
    Questao("Não tenho intenção de resgatar no curto prazo, mas não pretendo realizar novas aplicações", 3),
    Questao("Não tenho intenção de resgatar no curto prazo e ainda pretendo fazer aplicações regulares", 4)
)