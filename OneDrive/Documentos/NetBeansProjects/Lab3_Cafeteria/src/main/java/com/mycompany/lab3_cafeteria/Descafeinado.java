    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_cafeteria;

/**
 *
 * @author lucas
 */
public class Descafeinado implements Cafe{
    
    @Override
    public double custo() {
        return 12.00;
    }

    @Override
    public String getDescricao() {
        return "Cafe Descafeinado";
    }
    
}
