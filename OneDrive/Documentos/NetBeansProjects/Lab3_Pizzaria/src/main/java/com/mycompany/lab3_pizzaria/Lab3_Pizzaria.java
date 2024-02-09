/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3_pizzaria;

/**
 *
 * @author lucas
 */
public class Lab3_Pizzaria {
    
    public static void main(String [] args) {
        
        Pizza massaFina = new MassaFinaPizza();
        Pizza mar = new Ovo(massaFina);
        
        System.out.println(mar.custo());
        System.err.println(mar.getDescricao());
    }
    
}
