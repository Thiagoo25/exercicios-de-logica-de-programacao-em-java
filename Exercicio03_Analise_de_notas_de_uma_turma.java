package Exercicios_de_Logica;

// Você deverá desenvolver um programa em Java que:
// 1. Solicite a quantidade de alunos de uma turma.
// 2. Crie um vetor para armazenar as notas dos alunos.
// 3. Receba a nota de cada aluno (de 0 a 10).
// 4. Calcule e apresente:
// - A média geral da turma.
// - A maior nota.
// - A menor nota.
// - A quantidade de alunos aprovados (nota maior ou igual a 7).
// - A quantidade de alunos reprovados.
//  Ao final, apresente todas as notas armazenadas.

import java.util.Scanner;
import java.util.Locale;

public class Exercicio03_Analise_de_notas_de_uma_turma {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de Alunos: ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a Nota do Aluno %d: ", i + 1);
            vet[i] = sc.nextDouble();

            while (vet[i] < 0 || vet[i] > 10) {
                System.out.printf("Nota Incorreta, Digite novamente: ");
                vet[i] = sc.nextDouble();
            }
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];
        }

        double media = soma / n;

        double maior = vet[0];

        for (int i = 0; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        double menor = vet[0];

        for (int i = 0; i < n; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < n; i++) {
            if (vet[i] >= 7) {
                aprovados++;
            }
            else if (vet[i] < 7) {
                reprovados++;
            }
        }
        System.out.println("\n===== RESULTADO =====");
        System.out.printf("\nMedia Geral da Turma: %.1f%n", media);
        System.out.printf("Maior Nota: %.1f%n", maior);
        System.out.printf("Menor Nota: %.1f%n", menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.print("Todas as notas: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vet[i]);
        }

        sc.close();
    }
}
