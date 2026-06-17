package com.github.fernandacamaral.ecotrack;

import com.github.fernandacamaral.ecotrack.modelos.EnergiaRenovavel;
import com.github.fernandacamaral.ecotrack.modelos.Reflorestamento;
import com.github.fernandacamaral.ecotrack.servicos.CalculadoraDeImpacto;

public class Main {
    public static void main(String[] args) {
        Reflorestamento i1 = new Reflorestamento("Bosque", 5000, 150);
        EnergiaRenovavel i2 = new EnergiaRenovavel("Painés Fábrica", 20000, 12.5);

        CalculadoraDeImpacto calculadora = new CalculadoraDeImpacto();
        calculadora.registra(i1);
        calculadora.registra(i2);

        System.out.println(calculadora.getTotalDeCreditos());
    }
}
