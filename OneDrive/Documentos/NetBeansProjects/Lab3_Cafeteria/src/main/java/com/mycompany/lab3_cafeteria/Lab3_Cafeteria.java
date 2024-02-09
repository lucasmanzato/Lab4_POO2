/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3_cafeteria;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lab3_Cafeteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("-----------------------------------");
            System.out.println("Escolha Seu café");
            System.out.println("1- Cafe Expresso------------R$10,00");
            System.out.println("2- Cafe Descafeinad---------R$12,00");
            System.out.println("0- Sair");
            System.out.println("Digite a Opcao: ");
            System.out.println("-----------------------------------");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    criarCafe(new Expresso());
                    break;
                case 2:
                    criarCafe(new Descafeinado());
                    break;
                case 0:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
            
            
        }while(opcao != 0);
        scanner.close();
    }
    
    private static void criarCafe(Cafe cafe){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("--------------------------------");
            System.out.println("Monte seu café");
            System.out.println("1- Leite ------------R$2,00");
            System.out.println("2- Canela------------R$1,50");
            System.out.println("3- Chocolate---------R$3,00");
            System.out.println("0- Sem adicional");
            System.out.println("Digite a Opcao: ");
            System.out.println("--------------------------------");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    cafe = new Leite(cafe);
                    break;
                case 2:
                    cafe = new Canela(cafe);
                    break;
                case 3:
                    cafe = new Chocolate(cafe);
                    break;
                case 0:
                    System.out.println("Voltando!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }while(opcao != 0);
    
        System.out.println("--------------------------------");
        System.out.println("Valor Total: " + cafe.custo());
        System.out.println("Pedido: " + cafe.getDescricao());
        System.out.println("--------------------------------");
        
    }
}
