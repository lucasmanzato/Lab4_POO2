/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_ex2;

/**
 *
 * @author lucas
 */
public class Hilux implements IVehicle{

    @Override
    public void start() {
        System.out.println("Toyota Hilux ligada");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo a ToyotaHilux");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Hilux parada");    
    }
    
}