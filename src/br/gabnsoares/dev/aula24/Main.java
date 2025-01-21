package br.gabnsoares.dev.aula24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Quantas notas você vai cadastrar?");

        Scanner sc = new Scanner(System.in);
        int qtdNotas = sc.nextInt();
        sc.nextLine();

        int[] notas = new int[qtdNotas];

        for (int c = 0; c < qtdNotas; c++) {

            System.out.println("Digite o valor da nota " + (c + 1) + ": ");

            notas[c] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Imprimindo os valores das notas: ");
        for (int item: notas) {
            System.out.println(item);
        }

    }
}
