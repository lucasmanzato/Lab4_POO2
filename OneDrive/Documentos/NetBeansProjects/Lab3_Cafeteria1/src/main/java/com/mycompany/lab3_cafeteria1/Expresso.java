/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_cafeteria1;

/**
 *
 * @author lucas
 */
public class Expresso implements Cafe{
    
    @Override
    public double custo() {
        return 10.00;
    }

    @Override
    public String getDescricao() {
        return "Cafe Espresso";
    }
}
