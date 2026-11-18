package Exercicios_de_Logica;

// Faça um programa que leia um número inteiro N e utilize esse valor
// para definir o tamanho de uma matriz quadrada de números inteiros (N x N).
//
// Após preencher a matriz, o programa deverá apresentar:
//
// 1. A soma de todos os elementos da matriz.
// 2. A quantidade de números pares.
// 3. A soma dos elementos da diagonal principal.
// 4. O maior número armazenado na matriz.

import java.util.Scanner;

public class Exercicio01_AnaliseDeNumeros {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] vet = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vet[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soma = soma + vet[i][j];
            }
        }

        int par = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vet[i][j] % 2 == 0) {
                    par = par + 1;
                }
            }
        }

        int somadiagonal = 0;
        for (int i = 0; i < n; i++) {
            somadiagonal = somadiagonal + vet[i][i];
            }

        int maior = vet[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vet[i][j] > maior) {
                    maior = vet[i][j];
                }
            }
        }

        System.out.println("Soma dos Elementos:" + soma);
        System.out.println("Quantidade de Pares:" + par);
        System.out.println("Soma da Diagonal principal:" + somadiagonal);
        System.out.println("Maior Numero:" + maior);

        sc.close();
    }
}
