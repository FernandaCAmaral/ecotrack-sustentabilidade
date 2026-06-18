package com.github.fernandacamaral.ecotrack.servicos;

import com.github.fernandacamaral.ecotrack.modelos.IniciativaSustentavel;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeImpacto {
    private List<IniciativaSustentavel> iniciativas = new ArrayList<>();

    public void registra(IniciativaSustentavel iniciativa) {
        iniciativas.add(iniciativa);
    }

    public double calculaTotalDeCreditos() {
        double creditosCalculados = 0.0;

        for (IniciativaSustentavel i : iniciativas) {
            creditosCalculados += i.calculaCreditosGerados();
        }

        return creditosCalculados;
    }

    public void geraRelatorioGeral() {
        System.out.println("\n=======================================");
        System.out.println("    RELATÓRIO DE IMPACTO AMBIENTAL   ");

        for (IniciativaSustentavel i : iniciativas) {
            i.exibeDetalhes();
        }

        System.out.println(">>> TOTAL DE CRÉDITOS DA EMPRESA: " + calculaTotalDeCreditos());
        System.out.println("=======================================");
    }

}
