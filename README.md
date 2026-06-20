# 🌿 EcoTrack - Sistema de Gestão de Impacto Ambiental

O **EcoTrack** é um sistema de console desenvolvido em Java para simular o gerenciamento de iniciativas sustentáveis de uma empresa. O objetivo principal do projeto foi aplicar de forma prática conceitos fundamentais de Programação Orientada a Objetos (POO), coleções, tratamento de erros e simulação de integração com APIs.

---

## 🚀 Funcionalidades do Sistema

1. **Cadastro de Projetos de Reflorestamento:** Permite registrar o nome, custo e a quantidade de árvores plantadas.
2. **Cadastro de Projetos de Energia Renovável:** Permite registrar o nome, custo e a quantidade de Megawatts gerados.
3. **Relatório de Impacto Ambiental:** Lista todos os projetos cadastrados e calcula o total de créditos de carbono gerados de forma dinâmica.
4. **Extrato Financeiro Ecológico (Simulação de API):** Consome um serviço que simula uma API externa de cotação de créditos de carbono (em USD ou BRL) e calcula o valor financeiro total dos créditos acumulados.
5. **Sistema Seguro contra Falhas:** Implementação de escudos `try-catch` para evitar que o sistema feche caso o usuário digite dados inválidos ou custos negativos.

---

## 🛠️ Conceitos Praticados

* **Orientação a Objetos:** Uso de Herança, Encapsulamento, Construtores e Polimorfismo.
* **Polimorfismo Dinâmico:** Uma única classe de serviço (`CalculadoraDeImpacto`) gerencia diferentes tipos de iniciativas através de sua classe mãe.
* **Coleções (Collections):** Uso de `List` e `ArrayList` para criar o histórico dinâmico na memória.
* **Tratamento de Exceções:** Criação de exceção personalizada (`CustoInvalidoException`) e uso de `try-catch` com tratamento de buffer do `Scanner`.
* **Simulação de JSON:** Manipulação de Strings brutas simulando a resposta de uma API externa para cálculo de regras de negócio.