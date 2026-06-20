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

    public void emitirExtratoFinanceiro(String moeda) {

        String jsonResposta = SimuladorServicoMoeda.buscarCotacaoJson(moeda);

        double valorDoCreditoNoMercado = 0.0;

        if (jsonResposta.contains("USD")) {
            valorDoCreditoNoMercado = 4.50;
        } else if (jsonResposta.contains("BRL")) {
            valorDoCreditoNoMercado = 24.75;
        }

        double totalCreditosEmpresa = calculaTotalDeCreditos();

        double valorTotalEmDinheiro = totalCreditosEmpresa * valorDoCreditoNoMercado;

        System.out.println("--- EXTRATO FINANCEIRO AMBIENTAL ---");
        System.out.println("-> Total de Créditos acumulados: " + totalCreditosEmpresa);
        System.out.println("-> Cotação atual do Crédito (" + moeda.toUpperCase() + "): " + valorDoCreditoNoMercado);
        System.out.println("-> Valor Total Convertido: " + moeda.toUpperCase() + " " + valorTotalEmDinheiro);
        System.out.println("==========================================");
    }

}
