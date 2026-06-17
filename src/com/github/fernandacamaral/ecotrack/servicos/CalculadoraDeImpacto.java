package com.github.fernandacamaral.ecotrack.servicos;

import com.github.fernandacamaral.ecotrack.modelos.IniciativaSustentavel;

public class CalculadoraDeImpacto {
    private double totalDeCreditos = 0.0;

    public void registra(IniciativaSustentavel iniciativa) {
        iniciativa.exibeDetalhes();

        double creditosDaIniciativa = iniciativa.calculaCreditosGerados();

        totalDeCreditos += creditosDaIniciativa;
    }

    public double getTotalDeCreditos() {
        return totalDeCreditos;
    }

}
