/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author lucas
 */
public class Galaxy20 implements Celular{
    
    @Override
    public String getModelo() {
        return "Galaxy 20";
    }

    @Override
    public void fazLigacao() {
        System.out.println("Ligacao feita pelo Galaxy 20");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto tirada pelo Galaxy 20");
    }
}
