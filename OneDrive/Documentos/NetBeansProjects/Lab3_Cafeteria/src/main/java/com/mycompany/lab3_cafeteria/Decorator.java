/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_cafeteria;

/**
 *
 * @author lucas
 */
public class Decorator implements Cafe{
    
protected Cafe cafe;
    
    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double custo() {
        return cafe.custo();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
    
}