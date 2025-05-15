# 👋 Olá! Bem-vindo ao meu Conversor de Moedas!

Este projeto é um conversor de moedas desenvolvido em Java que utiliza a API ExchangeRate para obter taxas de câmbio atualizadas. O objetivo principal deste projeto é demonstrar a integração de uma API REST em Java, aplicando conceitos de encapsulamento e boas práticas de programação orientada a objetos. Foi desenvolvido para atender ao desafio do 1º Challenger da Especialização Back-End do Programa ONE em parceria com Alura Latam.

Pretendo continuar aprimorando de modo que ele possa converter qualquer moeda base em qualquer outra moeda, desenvolver a interface gráfica entre outras funcionalidades. Aguardem os próximos capítulos... 

## A princípio, suas funcionalidades são:

- **Conversão de Moedas**: Converte valores em Real (BRL) para diversas moedas, tais como:
  - Dólar Americano (USD)
  - Peso Argentino (ARS)
  - Euro (EUR)
  - Libra Esterlina (GBP)
  - Peso Uruguaio (UYU)
  - Guarani Paraguaio (PYG)
  - Peso Chileno (CLP)
  - Dólar Canadense (CAD)
  - Kwanza Angolano (AOA)
  - Coroa Dinamarquesa (DKK)
  
- **Integração com API**: Obtém a taxa de conversão atual utilizando a API ExchangeRate.

- **Tratamento de Erros e Validação**: Valida as entradas do usuário e trata exceções para tornar o aplicativo mais robusto e amigável.

- **Interface via Console**: Apresenta um menu interativo para o usuário escolher a conversão desejada.

Autor: Gilvaneide das Vitórias de Medeiros Bertaccini

:e-mail: Você pode entrar em contato comigo pelo e-mail: gilvaneide.m.bertaccini@gmail.com

:anchor:Link do meu projeto site Portfólio: https://portifolio-gilt-five-83.vercel.app/index.html

<a href = "mailto: gilvaneide.m.bertaccini@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

<a href="https://www.linkedin.com/in/gilvaneide-bertaccini/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## Tecnologias e Dependências

- **Java 11** ou superior
- **HTTP Client** nativo do Java (disponível a partir do Java 11)
- **Gson** para parsing do JSON

### Dependência Maven para o Gson
Se você utiliza Maven, adicione a seguinte dependência no seu `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.9.0</version>
</dependency>
