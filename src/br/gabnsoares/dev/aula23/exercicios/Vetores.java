package br.gabnsoares.dev.aula23.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        System.out.println("## GESTÃO DE INVENTARIO ##");
        System.out.println("""
                1 - ADICIONAR ITEM
                2 - REMOVER ITEM
                3 - SAIR""");

        String[] inventario = {" ", " ", " "};
        int opcao;
        int slot;


        do {
            System.out.println("SEU INVENTÁRIO: " + Arrays.toString(inventario));
            System.out.println("O QUE VOCÊ DESEJA FAZER?");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("ONDE VOCÊ VAI GUARDAR O ITEM (INDICE)?");
                    slot = sc.nextInt();
                    sc.nextLine();
                    System.out.println("QUAL O NOME DO ITEM?");
                    sc = new Scanner(System.in);
                    inventario[slot] = sc.nextLine();
                    break;
                case 2:
                    System.out.println("QUAL ITEM VOCÊ VAI REMOVER (INDICE)");
                    slot = sc.nextInt();
                    sc.nextLine();
                    inventario[slot] = null;
                    break;
                case 3:
                    System.out.println("Game Over...");
                    break;
                default:
                    System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
                    break;
            }
        } while (opcao != 3);
        System.out.println("Sistema Finalizado");
    }
}
