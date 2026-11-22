package Exercicios_de_Logica;

// Desenvolva um programa em Java que permita registrar os gastos
// de uma pessoa durante os 7 dias da semana.
//
// O programa deverá:
//
// 1. Solicitar o dia da semana e o valor gasto em cada um dos 7 dias.
// 2. Armazenar os dias e os valores em vetores.
// 3. Calcular o total gasto durante a semana.
// 4. Calcular a média de gastos por dia.
// 5. Identificar o dia com o maior gasto.
// 6. Exibir todos os gastos registrados.
// 7. Apresentar o total gasto, a média diária e o dia de maior gasto.

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07_Controle_de_gastos_semanais {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] semana = new String[7];
        Double[] vet = new Double[7];

        double total = 0;

        System.out.println("===== REGISTRO DE GASTOS =====");
        for (int i = 0; i < 7; i++) {
            System.out.print("Gasto de ");
            semana[i] = sc.next();
            vet[i] = sc.nextDouble();
            total = total + vet[i];
        }

        double media = total / 7;

        double maiorDia = vet[0];
        String indiceSemana = semana[0];

        for (int i = 0; i < 7; i++) {
            if (vet[i] > maiorDia) {
                maiorDia = vet[i];
                indiceSemana = semana[i];
            }
        }

        System.out.println("===== CONTROLE DE GASTOS =====");
        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.printf("Gasto de %s: R$ %.2f%n", semana[i], vet[i]);
        }

        System.out.println("\n===== RELATÓRIO SEMANAL =====");

        System.out.printf("Total de Gastos: R$ %.2f%n", total);
        System.out.printf("Média por dia: R$ %.2f%n", media);
        System.out.println("Dia de maior gasto: " + indiceSemana);
        System.out.printf("Maior gasto: R$ %.2f%n", maiorDia);
        sc.close();
    }
}
