/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author lucas
 */
public class IphoneS implements Celular{
    
@Override
public String getModelo() {
        return "Iphone S";
    }

    @Override
    public void fazLigacao() {
        System.out.println("Ligacao feita pelo Iphone S");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto tirada pelo Iphone S");
    }
}