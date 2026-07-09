# Sistema de Joalheria

## Sobre o Projeto

O Sistema de Joalheria é uma aplicação desenvolvida em Java como atividade da disciplina de Programação Orientada a Objetos (POO).

O sistema possibilita o cadastro, a pesquisa, a remoção e o armazenamento de informações de uma joalheria. Para cada joia são registrados seu nome, material de fabricação e preço.

A aplicação foi desenvolvida utilizando a biblioteca Java Swing para a construção da interface gráfica. Além disso, o projeto faz uso de coleções do Java para armazenar as informações em memória e da serialização de objetos para permitir que os dados sejam salvos em arquivo e recuperados posteriormente, garantindo a persistência das informações entre diferentes execuções do sistema.

---

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- Cadastro de joias;
- Pesquisa de joias pelo nome;
- Remoção de joias cadastradas;
- Salvamento dos dados em arquivo;
- Recuperação dos dados previamente salvos;
- Interface gráfica desenvolvida com Java Swing.

---

## Tecnologias Utilizadas

- Java
- Java Swing
- Maven
- JUnit 5
- Serialização de Objetos (`ObjectInputStream` e `ObjectOutputStream`)

---

## Estrutura do Projeto

O projeto está organizado em pacotes para facilitar sua manutenção e organização.

```text
src
├── main
│   └── java
│       └── br.ufpb.dcx.joalheria
│           ├── controller
│           ├── gui
│           ├── GravadorDeDados.java
│           ├── Joia.java
│           ├── ProgramaPrincipal.java
│           ├── SistemaJoalheria.java
│           └── SistemaJoalheriaInterface.java
│
└── test
    └── java
        └── br.ufpb.dcx.joalheria
```

---

## Interface Gráfica

A interface gráfica foi desenvolvida utilizando Java Swing e possui:

- Janela principal;
- Menu de opções;
- Botões para as principais funcionalidades;
- Ícones ilustrativos;
- Imagem representativa da joalheria;
- Caixas de diálogo para interação com o usuário.

---

## Persistência dos Dados

Os dados cadastrados são armazenados em arquivo utilizando serialização de objetos por meio das classes `ObjectOutputStream` e `ObjectInputStream`. Dessa forma, as informações permanecem disponíveis mesmo após o encerramento da aplicação.

---

## Testes

O projeto possui testes desenvolvidos com JUnit para verificar o funcionamento das principais funcionalidades do sistema.

---


**Ludmilla Paulino Correia**

Disciplina: Programação Orientada a Objetos