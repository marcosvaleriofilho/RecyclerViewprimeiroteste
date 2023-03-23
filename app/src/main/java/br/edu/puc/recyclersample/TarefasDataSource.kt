package br.edu.puc.recyclersample


fun tarefasList(): List<Tarefa> {
return listOf(
    Tarefa(nome = "Ir ao mercado fazer compras", concluida = false),
    Tarefa(nome = "Levar o pet no banho", concluida = false),
    Tarefa(nome = "Fazer o estudo de RecyclerView", concluida = true),
    Tarefa(nome = "Estudar Estrutura de Dados", concluida = false),
    Tarefa(nome = "Pagar a conta de internet", concluida = true),
    Tarefa(nome = "Levar o carro para consertar", concluida = false)
    )
}

