package com.github.fernandacamaral.ecotrack.servicos;

public class SimuladorServicoMoeda {
    public static String buscarCotacaoJson(String moeda) {
        if (moeda.equalsIgnoreCase("USD")) {
            return "{\"moeda\": \"USD\", \"valorCredito\": 4.50, \"status\": \"ativo\"};";
        } else if (moeda.equalsIgnoreCase("BRL")) {
            return "{\"moeda\": \"BRL\", \"valorCredito\": 24.75, \"status\": \"ativo\"}";
        } else {
            return "{\"error\": \"Moeda nao suportada\"}";
        }
    }
}
