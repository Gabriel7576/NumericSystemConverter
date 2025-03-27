# NumericSystemConverter

## Descrição

O **NumericSystemConverter** é uma aplicação desenvolvida em Java que permite a conversão de números entre diferentes sistemas numéricos, incluindo binário, octal, decimal e hexadecimal. Este projeto tem como objetivo auxiliar estudantes e profissionais a compreender e realizar conversões entre bases numéricas de forma eficiente.

## Funcionalidades

- Conversão de números binários para decimal, octal e hexadecimal.
- Conversão de números decimais para binário, octal e hexadecimal.
- Conversão de números octais para binário, decimal e hexadecimal.
- Conversão de números hexadecimais para binário, decimal e octal.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada no desenvolvimento da aplicação.

## Estrutura do Projeto

A estrutura de diretórios do projeto é organizada da seguinte forma:

NumericSystemConverter/
├── src/
│   └── com/
│       └── br/
│           └── gabriel/
│               └── numericsystemconverter/
│                   ├── Main.java
│                   └── Converter.java
├── .gitignore
└── README.md

- `src/com/br/gabriel/numericsystemconverter/Main.java`: Classe principal que inicializa a aplicação.
- `src/com/br/gabriel/numericsystemconverter/Converter.java`: Classe responsável pelas operações de conversão entre os sistemas numéricos.

## Como Executar

Para executar o projeto localmente, siga os passos abaixo:

1. **Clonar o repositório**:

   ```bash
   git clone https://github.com/Gabriel7576/NumericSystemConverter.git
   
2. **Compilar os arquivos Java:**

   ```bash
   javac com/br/gabriel/numericsystemconverter/*.java

3. **Executar a aplicação**

   ```bash
   java com.br.gabriel.numericsystemconverter.Main
