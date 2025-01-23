package br.gabnsoares.dev.aula25.exercicios;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        System.out.println("# Google Agenda CLI #");

        // linhas - dias da semana = 5
        // colunas - tarefas de cada dia da semana = 8

        Scanner sc = new Scanner(System.in);
        String[][] agenda = new String[5][8];

        for (int dia = 0; dia < 5; dia++) {

            String diaSemana = "";
            switch (dia) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terça";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
                default:
                    break;
            }

            System.out.println("Quer cadastrar tarefas para " + diaSemana + "?");

            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {

                // solicitar tarefas
                for (int tarefas = 0; tarefas < 8; tarefas++) {

                    System.out.println("Digite o nome da tarefa " + (tarefas + 1) + "/8 ou 'Finalizar': ");
                    String nomeTarefa = sc.nextLine();

                    if (nomeTarefa.equalsIgnoreCase("Finalizar")) {
                        break;
                    } else {
                        agenda[dia][tarefas] = nomeTarefa;
                    }
                }
            }
        }

        System.out.println("Agenda finalizada!");

        for (int i = 0; i < 5; i++) {

            String diaSemana = "";
            switch (i) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terça";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
                default:
                    break;
            }

            System.out.println("Agenda de " + diaSemana);

            for (int j = 0; j < 8; j++) {
                if (agenda[i][j] != null) {
                    System.out.println("-" + agenda[i][j]);
                }

            }
        }
    }
}
