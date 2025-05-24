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

src/conversordemoedas/
│
├── ConversorApp.java               # Classe principal (main)          
│
├── controller/
│   └── ConversorController.java    # Controla o fluxo entre view e model
│
├── model/
│   ├── ConversorModel.java         # Lógica de conversão
│   └── dto/
│       └── ConversorTaxasDTO.java  # Armazena as taxas de câmbio
│
└── view/
    └── ConversorView.java          # Interface com o usuário (console)
