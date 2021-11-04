fun main() {
    //val alunoTeste = Estudante("Fabricio", "Calvanese", 1212)
    val alunoTeste = Estudante("Fabricio", "Calvanese", 3212, 70.0, 7)
    val daniel = Estudante("Rogério", "da Silva", 1212, 90.0, 7)
    val alunoTerceiro = Estudante("Rogério", "da Silva", 1212, 50.0, 7)


    val cursoTeste = Cursos("Japonês", 9)

    //alunoTeste.mostraInformacoesAluno()

    //    cursoTeste.matricularEstudante(alunoTeste)
    //    cursoTeste.matricularEstudante(daniel)
    //    cursoTeste.matricularEstudante(alunoTeste)


    val listaEstudantesCriados = arrayOf(alunoTerceiro, daniel, alunoTeste)
    cursoTeste.matricularEstudante(listaEstudantesCriados)

    //cursoTeste.descadastrarAluno(alunoTeste)

    println(cursoTeste.contaEstudantesCadastrados())

}