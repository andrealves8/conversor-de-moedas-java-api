# 💱 Conversor de Moedas em Java

Este é um projeto de **Conversor de Moedas** desenvolvido em **Java**, utilizando o padrão de arquitetura **MVC (Model-View-Controller)**. 
Foi criado com o objetivo de praticar boas práticas de programação orientada a objetos, modularização de código e uso de ferramentas como Maven.

---

## 📌 Funcionalidades

- Conversão entre moedas: Real Brasileiro(BRL), Dólar(USD), Euro(EUR), Iene(JPY) e Peso Argentino(ARS)
- Entrada e saída via terminal
- Projeto organizado com separação de responsabilidades (Model, View e Controller)
- Pronto para expansão futura (interface gráfica, API externa, etc.)

---

## 🛠️ Tecnologias Utilizadas

- Java 21+
- Maven
- IDE: Eclipse
- Git + GitHub

---

## 📁 Estrutura do Projeto

![estrutura do projeto](https://github.com/user-attachments/assets/27a82850-f85f-4545-a482-5ade96715612)

🔎 Descrição de cada classe
ConversorApp
Classe com o método main, ponto de entrada do programa. Inicializa a view e o controller.

ConversorModel
Lógica de conversão entre moedas. Recebe um valor e aplica taxas conforme definidas.

ConversorTaxasDTO
Objeto simples que armazena taxas de câmbio (por exemplo, 1 BRL = 0.20 USD).

ConversorView
Responsável pela entrada do usuário (Scanner) e exibição dos resultados no console.

ConversorController
Coordena a comunicação entre View e Model. Recolhe dados, chama a lógica de conversão e entrega os resultados.

