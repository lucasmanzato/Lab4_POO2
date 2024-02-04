/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_ex2;

/**
 *
 * @author lucas
 */
public class Honda implements IVehicleMaker{

    private static Honda instancia;
    
    public static Honda getInstancia(){
        if(instancia == null){
            instancia = new Honda();
        }
        return instancia;
    }
    
    
    @Override
    public IVehicle makeVehicle(String modelo) {
        
        if("City".equalsIgnoreCase(modelo)){
            return new City();
        } else if ("Civic".equalsIgnoreCase(modelo)){
            return new Civic();
        }
        else if ("Fit".equalsIgnoreCase(modelo)){
            return new Fit();
        }
        return null;
    } 
}
