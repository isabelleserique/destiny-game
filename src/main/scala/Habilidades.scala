case class Habilidades(
  fe: Int = 0,
  inteligencia: Int = 0,
  forcaFisica: Int = 0,
  empatia: Int = 0
) {
  def atualizar(feDelta: Int, inteligenciaDelta: Int, forcaFisicaDelta: Int, empatiaDelta: Int): Habilidades = {
    Habilidades(
      fe + feDelta,
      inteligencia + inteligenciaDelta,
      forcaFisica + forcaFisicaDelta,
      empatia + empatiaDelta
    )
  }
  def atende(requisitos: Requisitos): Boolean = {
    fe >= requisitos.fe &&
    inteligencia >= requisitos.inteligencia &&
    forcaFisica >= requisitos.forcaFisica &&
    empatia >= requisitos.empatia
  }
}
