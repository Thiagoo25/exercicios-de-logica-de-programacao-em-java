package Exercicios_de_Logica;

// Faça um programa que leia um número inteiro N e utilize esse valor
// para definir a quantidade de dias que terão suas temperaturas registradas.
//
// Armazene as temperaturas em um vetor.
//
// Depois, o programa deverá:
//
// 1. Mostrar todas as temperaturas registradas.
// 2. Calcular a temperatura média dos dias.
// 3. Identificar a maior temperatura registrada.
// 4. Identificar a menor temperatura registrada.
// 5. Contar quantos dias tiveram temperatura acima da média.

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02_AnaliseDeTemperaturas {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dia %d: ", i + 1);
            temp[i] = sc.nextInt();
        }

        System.out.print("\nTemperaturas:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + temp[i]);
        }

        int soma = 0;

        for (int i = 0; i < n; i++) {
            soma = soma + temp[i];
        }

        double media = (double) soma / n;

        int maior = temp[0];

        for (int i = 0; i < n; i++) {
            if (temp[i] > maior) {
                maior = temp[i];
            }
        }

        int menor = temp[0];

        for (int i = 0; i < n; i++) {
            if (menor > temp[i]) {
                menor = temp[i];
            }
        }

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (temp[i] > media) {
                contador++;
            }
        }

        System.out.printf("\nMédia: %.2f%n", media);
        System.out.println("Maior Temperatura: " + maior);
        System.out.println("Menor Temperatura: " + menor);
        System.out.println("Dias acima da média: " + contador);

        sc.close();
    }
}
