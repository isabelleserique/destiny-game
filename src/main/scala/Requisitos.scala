case class Requisitos(
  fe: Int = 0,
  inteligencia: Int = 0,
  forcaFisica: Int = 0,
  empatia: Int = 0
)

object Requisitos {
  def requisitoAcolhito(habilidades: Habilidades): Boolean = {
    habilidades.fe >= 10 && habilidades.empatia >= 5
  }

  def requisitoGuardaSeguranca(habilidades: Habilidades): Boolean = {
    habilidades.inteligencia >= 4 && habilidades.forcaFisica >= 7
  }

  def requisitoAssistentePesquisa(habilidades: Habilidades): Boolean = {
    habilidades.inteligencia >= 7 && habilidades.forcaFisica >= 3
  }

  def requisitoIndustriario(habilidades: Habilidades): Boolean = {
    habilidades.fe >= 5 && habilidades.forcaFisica >= 5
  }
}
