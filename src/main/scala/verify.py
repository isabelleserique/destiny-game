# Função para simular escolhas nos cenários
def simular_escolhas(escolhas, impactos_cenarios_final):
    habilidades = {
        "Fé": 0,
        "Inteligência": 0,
        "Força Física": 0,
        "Empatia": 0
    }

    for i, escolha in enumerate(escolhas):
        impacto = impactos_cenarios_final[i+1][escolha]
        for habilidade, valor in impacto.items():
            habilidades[habilidade] += valor

    return habilidades

# Função para verificar se o jogador atingiu a profissão com base nas habilidades finais
def verificar_profissao(habilidades, requisitos):
    for habilidade, minimo in requisitos.items():
        if habilidades[habilidade] < minimo:
            return False
    return True

# Novos requisitos ajustados para as 4 profissões
profissoes_reduzidas_ajustadas_final = {
    "Acolhito": {"Fé": 10, "Empatia": 5},
    "Assistente de Pesquisa": {"Inteligência": 7, "Força Física": 3},
    "Segurança": {"Força Física": 7, "Inteligência": 4},
    "Industriário": {"Força Física": 5, "Fé": 5},
}

# Novos cenários com impactos ajustados
impactos_cenarios_final = {
    1: {"A": {"Inteligência": 2, "Força Física": 2, "Empatia": -1, "Fé": -1},
        "B": {"Empatia": 3, "Fé": 2, "Inteligência": -1, "Força Física": -1}},
    2: {"A": {"Empatia": 3, "Fé": 2, "Força Física": -1, "Inteligência": -1},
        "B": {"Inteligência": 3, "Força Física": 2, "Empatia": -2, "Fé": -1}},
    3: {"A": {"Fé": 3, "Empatia": 2, "Inteligência": -1, "Força Física": -1},
        "B": {"Inteligência": 3, "Força Física": 2, "Fé": -1, "Empatia": -2}},
    4: {"A": {"Fé": 3, "Empatia": 2, "Inteligência": -1, "Força Física": -1},
        "B": {"Inteligência": 3, "Força Física": 2, "Fé": -2, "Empatia": -2}},
    5: {"A": {"Força Física": 3, "Fé": 2, "Empatia": -1, "Inteligência": -1},
        "B": {"Empatia": 3, "Inteligência": 2, "Força Física": -1, "Fé": -1}},
}

# Escolhas simuladas para cada profissão
escolhas_simulacoes_reduzidas = {
    "Acolhito": ["B", "A", "A", "A", "A"],
    "Assistente de Pesquisa": ["B", "B", "B", "B", "B"],
    "Segurança": ["A", "B", "B", "A", "A"],
    "Industriário": ["A", "B", "A", "A", "A"]
}

# Testando com as profissões e cenários ajustados
resultados_final = {}
for profissao, escolhas in escolhas_simulacoes_reduzidas.items():
    habilidades_finais = simular_escolhas(escolhas, impactos_cenarios_final)
    atingiu = verificar_profissao(habilidades_finais, profissoes_reduzidas_ajustadas_final[profissao])
    resultados_final[profissao] = {"Habilidades": habilidades_finais, "Atingiu": atingiu}

print(resultados_final)
