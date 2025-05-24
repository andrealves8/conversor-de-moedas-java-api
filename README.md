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


---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/andrealves8/conversor-moedas.git
cd conversor-moedas
```

2. Compile o projeto com Maven:
```bash
mvn compile
```

3. Execute o projeto:
```bash
mvn exec:java -Dexec.mainClass="view.ConversorView"
```
✅ Verifique se o plugin exec-maven-plugin está configurado no pom.xml.



