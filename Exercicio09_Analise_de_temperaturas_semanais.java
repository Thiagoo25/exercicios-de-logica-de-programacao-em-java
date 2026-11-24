package Exercicios_de_Logica;

/* Desenvolva um programa em Java que realize a análise das
 * temperaturas registradas em três cidades durante sete dias
 * consecutivos.
 *
 * O programa deverá solicitar ao usuário o nome das três
 * cidades e registrar as temperaturas de cada uma ao longo
 * dos sete dias, utilizando um vetor para armazenar os nomes
 * e uma matriz para armazenar as temperaturas.
 *
 * Ao finalizar o registro dos dados, o programa deverá:
 *
 * 1. Calcular e apresentar a média semanal de temperatura
 *    de cada cidade.
 *
 * 2. Identificar a maior temperatura registrada, informando
 *    o valor, a cidade e o dia em que ocorreu.
 *
 * 3. Identificar a menor temperatura registrada, informando
 *    o valor, a cidade e o dia em que ocorreu.
 *
 * 4. Identificar qual cidade apresentou a maior média
 *    semanal, considerando a possibilidade de empate.
 *
 * 5. Contabilizar quantas temperaturas registradas ficaram
 *    acima de 30°C.
 *
 * 6. Calcular e apresentar a média de temperatura entre as
 *    três cidades para cada um dos sete dias.
 *
 * 7. Identificar quais cidades registraram temperaturas
 *    acima de 35°C em pelo menos três dias da semana,
 *    informando a quantidade de dias em que isso ocorreu.
 */

import java.util.Scanner;

public class Exercicio09_Analise_de_temperaturas_semanais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] cidades = new String[3];
        double[][] mat = new double[3][7];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome da cidade " + (i + 1) + ": ");
            cidades[i] = sc.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Temperaturas de " + cidades[i] + ":");

            for (int j = 0; j < 7; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                mat[i][j] = sc.nextDouble();
            }
        }

        // Cálculo das médias semanais

        double total1 = 0;
        double total2 = 0;
        double total3 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    total1 += mat[i][j];
                } else if (i == 1) {
                    total2 += mat[i][j];
                } else {
                    total3 += mat[i][j];
                }
            }
        }

        double media1 = total1 / 7;
        double media2 = total2 / 7;
        double media3 = total3 / 7;

        System.out.println("\n=== Médias semanais ===");

        System.out.printf("%s: %.2f°C%n", cidades[0], media1);
        System.out.printf("%s: %.2f°C%n", cidades[1], media2);
        System.out.printf("%s: %.2f°C%n", cidades[2], media3);

        // Maior temperatura

        double maiorTemp = mat[0][0];
        int linha1 = 0;
        int coluna1 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (mat[i][j] > maiorTemp) {
                    maiorTemp = mat[i][j];
                    linha1 = i;
                    coluna1 = j;
                }
            }
        }

        // Menor temperatura

        double menorTemp = mat[0][0];
        int linha2 = 0;
        int coluna2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (mat[i][j] < menorTemp) {
                    menorTemp = mat[i][j];
                    linha2 = i;
                    coluna2 = j;
                }
            }
        }

        System.out.println("\n=== Temperaturas extremas ===");

        System.out.printf("Maior temperatura: %.2f°C - %s, dia %d%n", maiorTemp, cidades[linha1], coluna1 + 1);
        System.out.printf("Menor temperatura: %.2f°C - %s, dia %d%n", menorTemp, cidades[linha2], coluna2 + 1);

        // Cidade com maior média semanal

        System.out.println("\n=== Cidade com maior média ===");

        if (media1 > media2 && media1 > media3) {
            System.out.println(cidades[0]);
        } else if (media2 > media1 && media2 > media3) {
            System.out.println(cidades[1]);
        } else if (media3 > media1 && media3 > media2) {
            System.out.println(cidades[2]);
        } else {
            System.out.println("Houve empate na maior média semanal.");
        }

        // Contagem de temperaturas acima de 30°C

        int registroTemp = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (mat[i][j] > 30) {
                    registroTemp++;
                }
            }
        }

        System.out.println("\nTotal de temperaturas acima de 30°C: " + registroTemp);

        // Média diária entre as três cidades

        System.out.println("\n=== Médias diárias ===");

        for (int j = 0; j < 7; j++) {
            double totalDia = 0;

            for (int i = 0; i < 3; i++) {
                totalDia += mat[i][j];
            }

            double mediaDia = totalDia / 3;

            System.out.printf("Dia %d: %.2f°C%n", j + 1, mediaDia);
        }

        // Verificação de temperaturas acima de 35°C

        int cidadesAcima35 = 0;

        for (int i = 0; i < 3; i++) {
            int diasAcima35 = 0;

            for (int j = 0; j < 7; j++) {
                if (mat[i][j] > 35) {
                    diasAcima35++;
                }
            }

            if (diasAcima35 >= 3) {
                System.out.println(cidades[i] + " teve temperaturas acima de 35°C em " + diasAcima35 + " dias.");

                cidadesAcima35++;
            }
        }

        if (cidadesAcima35 == 0) {
            System.out.println("Nenhuma cidade teve temperaturas acima de 35°C.");
        }

        sc.close();
    }
}
