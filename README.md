* Sistema de Cadastro de Usuários — Java

Este projeto foi desenvolvido com o objetivo de consolidar os fundamentos de Java e Programação Orientada a Objetos (POO) por meio de um sistema simples, mas bem estruturado, simulando comportamentos reais de um backend.

A aplicação roda via terminal e permite o gerenciamento básico de usuários, focando mais na qualidade do código e na lógica do que em interface gráfica.

  Objetivo do Projeto

O principal objetivo foi evoluir do “código que funciona” para um código:

mais organizado

com responsabilidades bem definidas

alinhado a boas práticas usadas no mercado

Este projeto também serve como base conceitual para aplicações futuras com Spring Boot.

  Funcionalidades

- Cadastrar usuário (nome e e-mail)

- Buscar usuário pelo e-mail

- Listar usuários cadastrados

- Remover usuário pelo e-mail

- Impedir usuários duplicados com base no e-mail

- Conceitos e Tecnologias Utilizadas

  Java

Programação Orientada a Objetos

Encapsulamento

Separação de responsabilidades

Identidade de objeto

equals() e hashCode()

Coleções Java

Set

HashSet

Camada de Serviço (Service)

Estrutura de projeto organizada

Menu interativo via Scanner

  Estrutura do Projeto

- Usuario
Responsável por representar a entidade do sistema e definir a identidade do usuário (email).

- UsuarioService
Camada responsável pela regra de negócio: cadastro, busca, listagem e remoção.

- Main
Responsável apenas por orquestrar o fluxo do sistema e interação com o usuário.

  Aprendizados

Durante o desenvolvimento deste projeto, foi possível fortalecer:

a lógica de backend

o entendimento real de OO na prática

o uso consciente de coleções

a importância de código limpo e organizado

Esse projeto marca um avanço importante na minha jornada como desenvolvedor backend Java.

  Como executar

Clone o repositório

Abra o projeto em uma IDE Java (IntelliJ, Eclipse, etc.)

Execute a classe Main

Interaja com o menu via terminal


