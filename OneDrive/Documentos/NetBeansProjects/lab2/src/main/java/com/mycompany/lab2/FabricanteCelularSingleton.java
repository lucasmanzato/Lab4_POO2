package com.mycompany.lab2;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */

public class FabricanteCelularSingleton implements FabricanteCelular {

    private static FabricanteCelularSingleton instancia;

    public static FabricanteCelularSingleton getInstancia() {
        if (instancia == null) {
            instancia = new FabricanteCelularSingleton();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if ("galaxy8".equalsIgnoreCase(modelo)) {
            return new Galaxy8();
        } else if ("galaxy20".equalsIgnoreCase(modelo)) {
            return new Galaxy20();
        } else if ("iphoneX".equalsIgnoreCase(modelo)) {
            return (Celular) new IphoneX();
        } else if ("iphoneS".equalsIgnoreCase(modelo)) {
            return new IphoneS();
        } else {
            return null;
        }
    }
}
