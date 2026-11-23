package Exercicios_de_Logica;

// Pergunte quantas vendas serão registradas no dia. Esse número deve ser maior que zero.
//
// Armazene o valor de cada venda em um vetor.
//
// Ao registrar cada venda, valide se o valor é maior que zero.
//
// Ao final, o programa deverá apresentar:
// - O valor total faturado no dia.
// - A média de valor por venda.
// - A quantidade de vendas acima de R$ 100,00.
// - O maior valor de venda registrado.
// - O menor valor de venda registrado.
// - A quantidade de vendas com valor de até R$ 50,00.

import java.util.Scanner;

public class Exercicio08_Sistema_de_vendas_e_analise_de_faturamento {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vendas deseja registrar? ");
        int n = sc.nextInt();

        while(n <= 0) {
            System.out.print("Valor incorreto, informe Quantas vendas deseja registrar? ");
            n = sc.nextInt();
        }

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vet[i] = sc.nextDouble();

            while(vet[i] <= 0) {
                System.out.print("Valor informado incorreto, digite o valor da venda " + (i + 1) + " novamente: ");
                vet[i] = sc.nextDouble();
            }
        }

        double totalFaturado = 0;

        for (int i = 0; i < n; i++) {
            totalFaturado = totalFaturado + vet[i];
        }

        double media = totalFaturado / n;

        System.out.println("\n===== RELATÓRIO DE VENDAS =====");
        System.out.printf("Total faturado: R$ %.2f%n", totalFaturado);
        System.out.printf("Média por venda: R$ %.2f%n", media);

        int acimadeCem = 0;

        for (int i = 0; i < n; i++) {
            if (vet[i] > 100) {
                acimadeCem++;
            }
        }

        System.out.println("Vendas acima de R$ 100,00: " + acimadeCem);

        double maiorVenda = vet[0];

        for (int i = 0; i < n; i++) {
            if (vet[i] > maiorVenda) {
                maiorVenda = vet[i];
            }
        }

        System.out.printf("Maior Venda: R$ %.2f%n", maiorVenda);

        double menorVenda = vet[0];

        for (int i = 0; i < n; i++) {
            if (vet[i] < menorVenda) {
                menorVenda = vet[i];
            }
        }

        System.out.printf("Menor Venda: R$ %.2f%n ", menorVenda);

        int vendasateCinquenta = 0;

        for (int i = 0; i < n; i++) {
            if (vet[i] > 0 && vet[i] <= 50) {
                vendasateCinquenta++;
            }
        }

        System.out.println("Quantidade de Vendas até R$ 50,00: " + vendasateCinquenta);

        sc.close();
    }
}
