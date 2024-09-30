case class Cenario(
  descricao: String,
  opcaoA: (String, Habilidades),
  opcaoB: (String, Habilidades)
)

object Cenarios {
  val lista: List[Cenario] = List(
    Cenario(
      "Você e sua equipe de pesquisa estão presos em uma montanha durante uma tempestade de neve. Um dos membros da equipe está gravemente ferido e o tempo está se esgotando.",
      ("Deixar o membro ferido e salvar o restante da equipe, garantindo a sobrevivência de todos os outros.", Habilidades(fe = -1, inteligencia = 2, forcaFisica = 2,empatia = -1)),
      ("Ficar e tentar salvar o membro ferido, mesmo que isso coloque a vida de todos em risco.", Habilidades(fe = 2, inteligencia = -1, forcaFisica = -1, empatia = 3))
    ),
    Cenario(
      "Durante uma missão de resgate em uma zona de guerra, você encontra um inimigo ferido e desarmado. Sua equipe está em conflito sobre o que fazer.",
      ("Oferecer ajuda médica ao inimigo, mesmo que isso atrase a missão e coloque sua equipe em maior risco.", Habilidades(fe = 2, forcaFisica = -1, inteligencia = -1, empatia = 3)),
      ("Ignorar o inimigo e continuar a missão, focando no objetivo principal.", Habilidades(fe = -1, inteligencia = 3, forcaFisica = 2, empatia = -2))
    ),
    Cenario(
      "Em uma expedição a um planeta inexplorado, o oxigênio da equipe está acabando. Você descobre que há oxigênio suficiente para apenas metade da tripulação sobreviver até a chegada do resgate.",
      ("Distribuir o oxigênio igualmente, mesmo sabendo que isso pode significar a morte de todos.", Habilidades(fe = 3,  inteligencia = -1, forcaFisica = -1, empatia = 2)),
      ("Priorizar os membros mais úteis da tripulação, sacrificando o restante para garantir a sobrevivência de alguns.", Habilidades(fe = -1, inteligencia = 3, forcaFisica = 2, empatia = -2))
    ),
    Cenario(
      "Você está em uma missão diplomática e descobre que a facção com quem está negociando planeja trair o acordo. Se expuser essa informação, pode desencadear uma guerra.",
      ("Revelar a traição, arriscando um conflito imediato, mas preservando sua integridade moral.", Habilidades(fe = 3, inteligencia = -1, forcaFisica = -1, empatia = 2)),
      ("Esconder a informação, tentando manipular os eventos para obter uma vantagem futura.", Habilidades(fe = -2, inteligencia = 3, forcaFisica = 2, empatia = -2))
    ),
    Cenario(
      "Você foi capturado e está sendo interrogado por um grupo de inimigos que querem informações críticas sobre a localização de seus aliados. Eles ameaçam torturar um civil inocente se você não falar.",
      ("Resistir à tortura e ao interrogatório, mesmo sabendo que o civil pode ser ferido.", Habilidades(fe = 2, inteligencia = -1, forcaFisica = 3, empatia = -1)),
      ("Ceder às ameaças para proteger o civil, mesmo que isso comprometa sua missão.", Habilidades(fe = -1, inteligencia = 2, forcaFisica = -1, empatia = 3))
    )
  )
}
