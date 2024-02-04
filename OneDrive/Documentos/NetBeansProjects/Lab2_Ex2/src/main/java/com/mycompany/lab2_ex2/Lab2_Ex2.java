/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2_ex2;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

/**
 *
 * @author palit
 */
public class Lab2_Ex2 {

    public static void main(String[] args) {
        // Com o Singleto pego a instancia das fabricas tanto toyota quanto honda
        Toyota toyotaFactory = Toyota.getInstancia();
        Honda hondaFactory = Honda.getInstancia();
        
        Scanner scanner = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("Escolha uma opção");
            System.out.println("1- Escolher carro");
            System.out.println("0- Sair ");
            
            System.out.println("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("Escolha entre Toyota ou Honda: ");
                    String toyotaOrHonda = scanner.nextLine().toLowerCase();
                    
                    
                    switch(toyotaOrHonda){
                        case "toyota":
                            System.out.println("Selecione um toyota");
                            System.out.println("- Hilux");
                            System.out.println("- Corolla");
                            System.out.println("- Etios");
                            System.out.println("Opção: ");
                            String modeloDesejadoT = scanner.nextLine().toLowerCase();
                            IVehicle toyota = toyotaFactory.makeVehicle(modeloDesejadoT);
                            
                            if(toyota != null){
                                switch(modeloDesejadoT){
                                    case "hilux":
                                        System.out.println("Voce escolheu " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;
                                    case "corolla":
                                        System.out.println("Voce escolheu  " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;
                                    case "etios":
                                        System.out.println("Voce escolheu  " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;    
                                }
                            }
                            break;
                        case "honda":
                            System.out.println("Você escolheu um Honda, dentre desses qual você quer");
                            System.out.println("- Civic");
                            System.out.println("- City");
                            System.out.println("- Fit");
                            String modeloDesejadoH = scanner.nextLine().toLowerCase();
                            IVehicle honda = hondaFactory.makeVehicle(modeloDesejadoH);
                            
                            if(honda != null){
                                switch(modeloDesejadoH){
                                    case "civic":
                                        System.out.println("Voce escolheu " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;
                                    case "city":
                                        System.out.println("Voce escolheu " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;
                                    case "fit":
                                        System.out.println("Voce escolheu " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;    
                                }
                            }
                    break;
                    }
            break;
            }
        }while(op!=0);
    }
}
