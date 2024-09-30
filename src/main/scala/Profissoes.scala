case class Profissao(nome: String, verificaRequisitos: Habilidades => Boolean)

object Profissoes {
  val acolhito = Profissao("Acolhito", Requisitos.requisitoAcolhito)
  val guardaSeguranca = Profissao("Guarda de Segurança", Requisitos.requisitoGuardaSeguranca)
  val assistentePesquisa = Profissao("Assistente de Pesquisa", Requisitos.requisitoAssistentePesquisa)
  val industriario = Profissao("Industriário", Requisitos.requisitoIndustriario)

  val lista: List[Profissao] = List(acolhito, guardaSeguranca, assistentePesquisa, industriario)

  def determinarProfissao(habilidades: Habilidades): String = {
    lista.find(_.verificaRequisitos(habilidades)).map(_.nome).getOrElse("Nenhuma profissão")
  }
}
