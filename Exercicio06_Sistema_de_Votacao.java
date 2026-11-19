package Exercicios_de_Logica;

// Desenvolva um programa em Java que simule um sistema de votação
// para três candidatos: Ana, Bruno e Carlos.
//
// O programa deverá:
//
// 1. Exibir um menu com os candidatos e solicitar os votos.
// 2. Encerrar a votação quando o usuário digitar 0.
// 3. Contabilizar os votos de cada candidato.
// 4. Identificar e contabilizar os votos inválidos.
// 5. Apresentar o total de votos válidos e inválidos.
// 6. Calcular a porcentagem de votos de cada candidato.
// 7. Identificar o candidato vencedor ou informar se houve empate.
// 8. Informar caso nenhum voto válido tenha sido registrado.

import java.util.Scanner;

public class Exercicio06_Sistema_de_Votacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int votosAna = 0;
        int votosBruno = 0;
        int votosCarlos = 0;

        int votosValidos = 0;
        int votosInvalidos = 0;

        System.out.println("===== SISTEMA DE VOTAÇÃO =====");
        System.out.println();
        System.out.println("1 - Ana");
        System.out.println("2 - Bruno");
        System.out.println("3 - Carlos");
        System.out.println("0 - Encerrar votação");

        System.out.print("Digite seu voto: ");
        int voto = sc.nextInt();

        while (voto != 0) {

            if (voto >= 1 && voto <= 3) {

                switch (voto) {
                    case 1:
                        votosAna++;
                        break;

                    case 2:
                        votosBruno++;
                        break;

                    case 3:
                        votosCarlos++;
                        break;
                }

                votosValidos++;

            } else {
                votosInvalidos++;

                System.out.print("Número informado incorreto! ");
            }

            System.out.print("Digite seu voto: ");
            voto = sc.nextInt();
        }

        System.out.println("\n===== RESULTADO DA VOTAÇÃO =====");

        System.out.println("\nTotal de Votos de Ana: " + votosAna);
        System.out.println("Total de Votos de Bruno: " + votosBruno);
        System.out.println("Total de Votos de Carlos: " + votosCarlos);
        System.out.println("Total de Votos Válidos: " + votosValidos);
        System.out.println("Total de Votos Inválidos: " + votosInvalidos);

        if (votosValidos > 0) {

            double percentualVotosAna = (double) votosAna / votosValidos * 100;
            double percentualVotosBruno = (double) votosBruno / votosValidos * 100;
            double percentualVotosCarlos = (double) votosCarlos / votosValidos * 100;

            System.out.printf("Percentual de Votos de Ana: %.2f%%%n", percentualVotosAna);
            System.out.printf("Percentual de Votos de Bruno: %.2f%%%n", percentualVotosBruno);
            System.out.printf("Percentual de Votos de Carlos: %.2f%%%n", percentualVotosCarlos);

            if (votosAna == 0 && votosBruno == 0 && votosCarlos == 0) {
                System.out.println("Nenhum candidato recebeu votos.");

            } else if (votosAna > votosBruno && votosAna > votosCarlos) {
                System.out.println("Candidata Vencedora: Ana");

            } else if (votosBruno > votosAna && votosBruno > votosCarlos) {
                System.out.println("Candidato Vencedor: Bruno");

            } else if (votosCarlos > votosAna && votosCarlos > votosBruno) {
                System.out.println("Candidato Vencedor: Carlos");

            } else {
                System.out.println("EMPATE");
            }

        } else {
            System.out.println("Nenhum voto válido foi registrado.");
        }

        sc.close();
    }
}
