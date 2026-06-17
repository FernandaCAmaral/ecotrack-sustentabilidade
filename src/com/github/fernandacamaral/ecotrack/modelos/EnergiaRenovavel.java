package com.github.fernandacamaral.ecotrack.modelos;

public class EnergiaRenovavel extends IniciativaSustentavel {
    private double megawattsGerados;

    public EnergiaRenovavel(String nome, double custoImplementacao, double megawattsGerados) {
        super(nome, custoImplementacao);
        this.megawattsGerados = megawattsGerados;
    }



    @Override
    public double calculaCreditosGerados() {
        return megawattsGerados * 50;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("MegaWatts Gerados: " + megawattsGerados);
        System.out.println("Créditos Gerados: " + calculaCreditosGerados());
    }
}
