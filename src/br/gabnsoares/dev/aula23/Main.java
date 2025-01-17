package br.gabnsoares.dev.aula23;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tipoDeDado[] nomeVariavel = {valor, valor, valor};
        // tipoDeDado[] nomeVariavel = new tipoDeDado[tamanho do vetor];

        System.out.println(" # LISTA DE TAREFAS # ");
        System.out.println("Quantas tarefas você  quer cadastrar?");

        Scanner sc = new Scanner(System.in);
        int qtdTarefas= sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[qtdTarefas];

        for (int c = 0; c < qtdTarefas; c++) {

            System.out.println("Digite a tarefa "+ (c + 1) + ": ");

            tarefas[c] = sc.nextLine();
        }

        System.out.println("Sua lista de tarefas cadastrada é:");
        System.out.println(Arrays.toString(tarefas));

    }
}
