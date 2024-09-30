import Profissoes.determinarProfissao
object Jogo {
  def main(args: Array[String]): Unit = {
    val personagem = Personagem("Jogador", Habilidades())
    val cenarios = Cenarios.lista
    val personagemFinal = jogar(personagem, cenarios)
    val profissaoFinal = determinarProfissao(personagemFinal.habilidades)
    
    println(s"Sua profissão é: $profissaoFinal")
    println(s"Suas habilidades finais: ${personagemFinal.habilidades}")
  }

  def jogar(personagem: Personagem, cenarios: List[Cenario]): Personagem = {
    cenarios.foldLeft(personagem) { (p, cenario) =>
      println(cenario.descricao)
      println("Escolha uma opção:")
      println(s"1: ${cenario.opcaoA._1}")
      println(s"2: ${cenario.opcaoB._1}")

      val escolha = scala.io.StdIn.readInt()
      val opcaoEscolhida = if (escolha == 1) cenario.opcaoA._2 else cenario.opcaoB._2
      p.escolherOpcao(opcaoEscolhida)
    }
  }
}
