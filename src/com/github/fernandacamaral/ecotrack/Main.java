package com.github.fernandacamaral.ecotrack;

import com.github.fernandacamaral.ecotrack.modelos.EnergiaRenovavel;
import com.github.fernandacamaral.ecotrack.modelos.Reflorestamento;
import com.github.fernandacamaral.ecotrack.servicos.CalculadoraDeImpacto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculadoraDeImpacto calculadora = new CalculadoraDeImpacto();

        int entrada = 0;
        while (entrada != 4) {
            System.out.println("\n______ ECOTRACK - MENU PRINCIPAL ______");
            System.out.println("""
                    1 - Cadastrar Projeto de Reflorestamento
                    2 - Cadastrar Projeto de Energia Renovável
                    3 - Emitir Relatório de Impacto Ambiental
                    4 - Sair""");
            System.out.print("Escolha uma opção: ");

            entrada = scanner.nextInt();
            scanner.nextLine();

            switch (entrada) {
                case 1:
                    System.out.print("Digite o nome da Iniciativa: ");
                    String nomeReflorestar = scanner.nextLine();

                    System.out.print("Agora o custo da implementação: R$ ");
                    double custoReflorestar = scanner.nextDouble();

                    System.out.print("E quantidades de árvores plantadas: ");
                    int arvoresPlantadas = scanner.nextInt();
                    scanner.nextLine();

                    Reflorestamento novoReflorestamento = new Reflorestamento(nomeReflorestar, custoReflorestar, arvoresPlantadas);

                    calculadora.registra(novoReflorestamento);
                    System.out.println("✅ Projeto de Reflorestamento registrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome da Iniciativa: ");
                    String nomeEnergia = scanner.nextLine();

                    System.out.print("Agora o custo de implementação: R$ ");
                    double custoEnergia = scanner.nextDouble();

                    System.out.print("E a quantidade de Megawatts gerados: ");
                    double megawatts = scanner.nextDouble();
                    scanner.nextLine();

                    EnergiaRenovavel novaEnergia = new EnergiaRenovavel(nomeEnergia, custoEnergia, megawatts);

                    calculadora.registra(novaEnergia);
                    System.out.println("✅ Projeto de Energia Renovável registrado com sucesso!");
                    break;

                case 3:
                    calculadora.geraRelatorioGeral();
                    break;

                case 4:
                    System.out.println("Encerrando o EcoTrack... ");
                    break;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
