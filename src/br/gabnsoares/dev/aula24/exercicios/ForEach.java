package br.gabnsoares.dev.aula24.exercicios;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        System.out.println("/** TODO LIST CLI * BY MICROSOFT **/");
        System.out.println("Quantas tarefas você deseja criar?");

        Scanner sc = new Scanner(System.in);
        int qtdTask = sc.nextInt();
        sc.nextLine();

        String[] tasks =  new String[qtdTask];
        qtdTask =  Integer.parseInt(String.valueOf(qtdTask));
        int c;

        for (c = 0; c < qtdTask; c++) {

            System.out.println("Digite a tarefa " +  (c+1) + ": ");

            tasks[c] = sc.nextLine();
        }
        System.out.println("CADASTRO ENCERRADO");
        System.out.println("Hoje você vai fazer as tarefas:");

        for(String item: tasks) {
            System.out.println(item);
        }

    }
}
