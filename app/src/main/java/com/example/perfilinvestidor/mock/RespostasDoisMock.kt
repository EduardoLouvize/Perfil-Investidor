package com.example.perfilinvestidor.mock

import com.example.perfilinvestidor.model.Questao

val respostasDois = listOf<Questao>(
    Questao("Preservação do capital para não perder valor ao longo do tempo,\n" +
            "assumindo baixos riscos de perdas", 0),
    Questao("Aumento gradual do capital ao longo do tempo, assumindo riscos\n" +
            "moderados", 2),
    Questao("Aumento do capital acima da taxa de retorno média do mercado, mesmo\n" +
            "que isso implique assumir riscos de perdas elevadas", 4),
    Questao("Obter no curto prazo retornos elevados e signi\u001Fcativamente acima da taxa\n" +
            "de retorno média do mercado, assumindo riscos elevados\n", 5)
)