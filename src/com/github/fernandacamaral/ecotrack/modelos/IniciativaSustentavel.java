package com.github.fernandacamaral.ecotrack.modelos;

import com.github.fernandacamaral.ecotrack.excecoes.CustoInvalidoException;

public class IniciativaSustentavel {
    private String nome;
    private double custoImplementacao;

    public IniciativaSustentavel(String nome, double custoImplementacao) {
        if (custoImplementacao < 0) {
            throw new CustoInvalidoException("O custo de implementação não pode ser negativo!");
        }

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
