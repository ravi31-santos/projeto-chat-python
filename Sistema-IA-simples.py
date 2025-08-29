import random


conhecimento = {
    "oi": ["Oi! Como vai?", "Olá! Tudo bem?"],
    "tudo bem": ["Que bom! E você?", "Ótimo! Como você está?"],
    "nome": ["Eu sou um chatbot simples.", "Pode me chamar de PyBot!"],
    "idade": ["Não tenho idade, sou um programa!", "Sou jovem de código!"],
    "filme": ["Adoro Matrix!", "Gosto de filmes de ficção científica."],
    "sair": ["Tchau! Até a próxima.", "Foi bom conversar com você!"]
}

def responder(mensagem):
    mensagem = mensagem.lower()
    for chave in conhecimento:
        if chave in mensagem:
            return random.choice(conhecimento[chave])
    return "Desculpe, não entendi. Pode explicar melhor?"

# Loop de conversa
print("🤖 PyBot: Olá! Digite 'sair' para encerrar.\n")
while True:
    usuario = input("Você: ")
    resposta = responder(usuario)
    print("🤖 PyBot:", resposta)
    if "sair" in usuario.lower():
        break
