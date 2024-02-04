package com.mycompany.lab2;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class IphoneX implements Celular {

    @Override
    public String getModelo() {
        return "Iphone X";
    }

    @Override
    public void fazLigacao() {
        System.out.println("Ligacao feita pelo Iphone X");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto tirada pelo Iphone X");
    }
}
