package Exercicios_de_Logica;

// Desenvolva um programa em Java que simule o controle de ocupação
// de uma sala de cinema, composta por 4 fileiras e 5 assentos por fileira.
//
// Utilize uma matriz para armazenar a situação de cada assento, sendo:
// 0 - Assento livre.
// 1 - Assento ocupado.
//
// O programa deverá:
//
// 1. Receber a situação de cada assento, validando os valores informados.
// 2. Apresentar a matriz com a situação de todos os assentos.
// 3. Calcular a quantidade de assentos livres e ocupados.
// 4. Calcular a porcentagem de ocupação da sala.
// 5. Identificar a fileira com maior quantidade de assentos ocupados.
// 6. Informar se a ocupação da sala está abaixo, acima ou exatamente em 50%.

import java.util.Scanner;

public class Exercicio04_Controle_de_Assentos_de_Cinema {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][5];
        int assentosLivres = 0;
        int assentosOcupados = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();

                while (mat[i][j] != 0 && mat[i][j] != 1) {
                    System.out.println("Numero incorreto, Digite novamente: ");
                    mat[i][j] = sc.nextInt();
                }

                if (mat[i][j] == 0) {
                    assentosLivres++;
                }

                else {
                    assentosOcupados++;
                }
            }
        }

        System.out.println("\nMatriz de Ocupação:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int total = assentosLivres + assentosOcupados;

        double ocupacao = (double) assentosOcupados / total * 100;

        int maiorOcupacao = 0;
        int fileiraMaisOcupada = 0;

        for (int i = 0; i < 4; i++) {
                int ocupadosFileira = 0;

            for (int j = 0; j < 5; j++) {
               if (mat[i][j] == 1) {
                   ocupadosFileira++;
               }
            }

            if (ocupadosFileira > maiorOcupacao) {
                maiorOcupacao = ocupadosFileira;
                fileiraMaisOcupada = i + 1;
            }
        }

        System.out.println("\nAssentos ocupados: " + assentosOcupados);
        System.out.println("Assentos Livres: " + assentosLivres);
        System.out.printf("Ocupação: %.2f%%%n", ocupacao);

        if (fileiraMaisOcupada > 0) {
            System.out.println("Fileira mais ocupada: " + fileiraMaisOcupada);
        }

        else {
            System.out.println("não há nenhuma fileira ocupada.");
        }

        if (ocupacao < 50) {
            System.out.println("A sala está abaixo de 50% de ocupação.");
        }

        else if (ocupacao > 50) {
            System.out.println("A sala está acima de 50% de ocupação.");
        }

        else {
            System.out.println("A sala está exatamente com 50% de ocupação.");
        }

        sc.close();
    }
}
