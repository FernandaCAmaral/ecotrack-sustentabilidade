package com.github.fernandacamaral.ecotrack.modelos;

public class Reflorestamento extends IniciativaSustentavel {
    private int quantidadeArvores;

    public Reflorestamento(String nome, double custoImplementacao, int quantidadeArvores) {
        super(nome, custoImplementacao);
        this.quantidadeArvores = quantidadeArvores;
    }

    @Override
    public double calculaCreditosGerados() {
        return quantidadeArvores * 10;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Árvores Plantadas: " + quantidadeArvores);
        System.out.println("Créditos Gerados: " + calculaCreditosGerados());
    }
}
