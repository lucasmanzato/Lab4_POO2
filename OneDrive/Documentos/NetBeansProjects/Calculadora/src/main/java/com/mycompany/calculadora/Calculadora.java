/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author lucas
 */
public class Calculadora {

    public static void main(String[] args) {
        CalculadoraAdapter adapter = new CalculadoraAdapter(new CalculadoraDecimal(),new CalculadoraBinaria());
        
        System.out.println("Soma binaria de 1010 + 10110 = " + adapter.somar("1010", "10110"));
        System.out.println("Subtracao binaria de 1110 + 101 = " + adapter.subtrair("1110", "101"));
        System.out.println("Soma decimal de 6 + 2 = " + adapter.somar(6, 2));
        System.out.println("Subtracao decimal de 7 - 2 = " + adapter.subtrair(7, 2));
        System.out.println("Multiplicacao decimal de 7 * 2 = " + adapter.multiplicar(7, 2));
    }
}