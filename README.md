
#  Projeto Calculadora com Testes Automatizados - Projeto Integrador IV-A

Este repositório contém a implementação de uma calculadora simples desenvolvida em Java, com foco em **testes automatizados utilizando JUnit 5** e práticas de **versionamento com Git e GitHub**, conforme as diretrizes do Projeto Integrador IV-A da PUC Goiás.

##  Objetivo

O projeto visa aplicar na prática conceitos de **verificação e validação de software**, bem como o **gerenciamento colaborativo de código** utilizando GitHub.

## ⚙️ Funcionalidades

A classe `Calculadora.java` implementa os seguintes métodos:

- ➕ Soma (`somar`)
- ➖ Subtração (`subtrair`)
- ✖️ Multiplicação (`multiplicar`)
- ➗ Divisão (`dividir`) – com tratamento para divisão por zero

##  Testes Automatizados

A classe `CalculadoraTest.java`, localizada em `src/test/java/br/puc/calculadora`, contém testes unitários com JUnit 5 cobrindo os seguintes cenários:

- Números positivos e negativos
- Operações com zero
- Divisão por zero (validação de exceção)
- Resultados com casas decimais (validação com margem de erro)

##  Controle de Versão

O repositório foi estruturado com o seguinte fluxo de versionamento:

- Branch principal: `master`
- Branch de desenvolvimento: `Construcao-Codigo-CalculadoraTest`
- Branch padrão (default): `construcao-codigo-calculadora`

Todos os commits foram realizados com mensagens descritivas, e o merge foi feito via pull request para simular um ambiente colaborativo.

##  Estrutura de Pastas

```
projeto-calculadora/
├── src/
│   ├── main/java/br/puc/calculadora/
│   │   └── Calculadora.java
│   └── test/java/br/puc/calculadora/
│       └── CalculadoraTest.java
├── target/
│   └── [arquivos compilados]
├── .gitignore
└── pom.xml
```

## Tecnologias Utilizadas

- Java 17+
- JUnit 5
- Git / GitHub
- GitHub Desktop (para versionamento visual)
- Maven (gerenciamento de dependências)

## Autora

**Lara Eduarda**  
Aluna do curso de Análise e Desenvolvimento de Sistemas - PUC Goiás  
[laraeduaribeirodeassis@gmail.com]
