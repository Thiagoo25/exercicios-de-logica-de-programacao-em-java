package Exercicios_de_Logica;

// Desenvolva um programa em Java que simule o controle de estoque de uma loja.
//
// O programa deverá:
//
// 1. Solicitar a quantidade de produtos cadastrados.
// 2. Armazenar o nome de cada produto em um vetor.
// 3. Armazenar a quantidade disponível de cada produto em outro vetor.
// 4. Validar as entradas, garantindo que a quantidade de produtos seja maior que zero
//    e que o estoque informado não seja negativo.
// 5. Identificar os produtos com estoque abaixo de 5 unidades.
// 6. Exibir o produto com maior quantidade em estoque.
// 7. Calcular a quantidade total de unidades disponíveis na loja.

import java.util.Scanner;

public class Exercicio05_Controle_de_Estoque_de_uma_Loja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de produtos: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Quantidade Incorreta, Digite novamente: ");
            n = sc.nextInt();
        }

        String[] produto = new String[n];
        int[] quantidade = new int[n];

        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("Produto: ");
            produto[i] = sc.next();
            System.out.print("Estoque: ");
            quantidade[i] = sc.nextInt();

            while (quantidade[i] < 0) {
                System.out.println("Número Informado Incorreto, digite novamente:");
                quantidade[i] = sc.nextInt();
            }
        }

        int maior = quantidade[0];
        int indiceMaior = 0;

        for (int i = 0; i < n; i++) {
            if (quantidade[i] > maior) {
                maior = quantidade[i];
                indiceMaior = i;
            }
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + quantidade[i];

        }

        System.out.println("\n===== RELATÓRIO DE ESTOQUE =====");

        System.out.println("\nProdutos com estoque baixo:");

        for (int i = 0; i < n; i++) {
            if (quantidade[i] < 5) {
                System.out.println(produto[i] + " - " + quantidade[i]);
            }
        }

        System.out.println("\nMaior Estoque: " + produto[indiceMaior] + " - " + maior + " unidades");

        System.out.println("Total de unidades: " + total);

        sc.close();
    }
}
