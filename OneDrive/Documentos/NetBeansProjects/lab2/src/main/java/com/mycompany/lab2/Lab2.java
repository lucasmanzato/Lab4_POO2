/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        FabricanteCelularSingleton fabricante = FabricanteCelularSingleton.getInstancia();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Construir celular");
            System.out.println("0- Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o modelo do celular: ");
                    String modeloDesejado = scanner.nextLine().toLowerCase();

                    Celular celular = fabricante.constroiCelular(modeloDesejado);

                    if (celular != null) {
                        switch (modeloDesejado) {
                            case "galaxy8" -> {
                                System.out.println("Voce escolheu  " + celular.getModelo());
                                celular.tiraFoto();
                                celular.fazLigacao();
                            }
                            case "galaxy20" -> {
                                System.out.println("Voce escolheu  " + celular.getModelo());
                                celular.tiraFoto();
                                celular.fazLigacao();
                            }
                            case "iphonex" -> {
                                System.out.println("Voce escolheu  " + celular.getModelo());
                                celular.tiraFoto();
                                celular.fazLigacao();
                            }
                            case "iphones" -> {
                                System.out.println("Voce escolheu  " + celular.getModelo());
                                celular.tiraFoto();
                                celular.fazLigacao();
                            }
                            default -> System.out.println("Modelo desconhecido.");
                        }
                    } else {
                        System.out.println("Falha na construção do celular. Verifique o modelo.");
                    }
                }
                case 0 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
