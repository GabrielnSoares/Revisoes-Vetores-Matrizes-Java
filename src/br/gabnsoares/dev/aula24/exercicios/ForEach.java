package br.gabnsoares.dev.aula24.exercicios;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        System.out.println("/** TODO LIST CLI * BY MICROSOFT **\\");
        System.out.println("Quantas tarefas você deseja criar?");

        Scanner sc = new Scanner(System.in);
        int qtdTarefa = sc.nextInt();
        sc.nextLine();
// criando vetor do tomanho solicitado pelo client
        String[] tarefas =  new String[qtdTarefa];
        qtdTarefa =  Integer.parseInt(String.valueOf(qtdTarefa));
// preencher cada tarefa individualmente
        for (int c = 0; c < qtdTarefa; c++) {

            System.out.println("Digite a tarefa " +  (c+1) + ": ");

            tarefas[c] = sc.nextLine();
        }
        System.out.println("CADASTRO ENCERRADO");
        System.out.println("Hoje você vai fazer as tarefas:");
// for each - imprimir tarefas de forma ordenada
        int c = 1;
        for(String tarefa: tarefas) {
            System.out.println(c + "-" + tarefa);
            c++;
        }

    }
}
