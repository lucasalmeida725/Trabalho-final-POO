# 🧵 Sistema de Gerenciamento de Estoque de Roupas - Trabalho Final de POO

Este projeto é um sistema em Java desenvolvido para controle de estoque de peças de roupa. Ele foi criado como **trabalho final da disciplina de Programação Orientada a Objetos (POO)**, utilizando conceitos sólidos como herança, polimorfismo, encapsulamento, abstração e interfaces.

O sistema funciona inteiramente via **terminal**, com menus interativos que simulam vendas, reposição automática de estoque e controle por tipo de produto.

---

##  Funcionalidades principais

- Cadastro inicial de peças com diferentes categorias:
  - Acessórios
  - Roupas de tamanho único
  - Roupas com tamanhos P, M e G
- Venda de produtos com controle de quantidade
- Reposição automática caso o estoque esteja abaixo do mínimo
- Visualização do estoque final ao encerrar o programa

---

##  Estrutura POO aplicada

- **Abstração**: classe abstrata `Peca` representa qualquer tipo de peça
- **Herança**: `RoupaPMG`, `RoupaTamanhoUnico` e `Acessorio` herdam de `Peca`
- **Interface**: `Item` define o contrato `venda()` para todas as peças
- **Polimorfismo**: métodos `venda()` com comportamentos distintos em cada subclasse
- **Encapsulamento**: atributos protegidos com acesso via métodos

---

##  Tecnologias utilizadas

- Java (versão 17 ou superior recomendada)
- Nenhuma biblioteca externa (Java puro)
- Execução via terminal (linha de comando ou console da IDE)

---


