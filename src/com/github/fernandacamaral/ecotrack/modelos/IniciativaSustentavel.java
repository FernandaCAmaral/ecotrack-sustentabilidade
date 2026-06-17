package com.github.fernandacamaral.ecotrack.modelos;

public class IniciativaSustentavel {
    private String nome;
    private double custoImplementacao;

    public IniciativaSustentavel(String nome, double custoImplementacao) {
        this.nome = nome;
        this.custoImplementacao = custoImplementacao;
    }

    public String getNome() {
        return nome;
    }

    public double getCustoImplementacao() {
        return custoImplementacao;
    }

    public double calculaCreditosGerados() {
        return 0.0;
    }

    public void exibeDetalhes() {
        System.out.println("-----------------------------");
        System.out.println("-> Projeto: " + nome);
        System.out.println("-> Custo de Implementação: R$ " + custoImplementacao);
    }
}
