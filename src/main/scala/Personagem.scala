case class Personagem(nome: String, habilidades: Habilidades) {
  def escolherOpcao(opcao: Habilidades): Personagem = {
    copy(habilidades = habilidades.atualizar(
      opcao.fe,
      opcao.inteligencia,
      opcao.forcaFisica,
      opcao.empatia
    ))
  }
}