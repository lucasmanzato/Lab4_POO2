/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_cafeteria1;

/**
 *
 * @author lucas
 */
public class Canela extends Decorator{
    
    public Canela(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double custo() {
        return cafe.custo() + 1.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com canela";
    }
}
