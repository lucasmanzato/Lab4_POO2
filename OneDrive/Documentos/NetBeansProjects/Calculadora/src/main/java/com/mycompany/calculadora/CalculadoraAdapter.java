/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author lucas
 */
public class CalculadoraAdapter implements CalculadoraI{

    private CalculadoraDecimalI calcDI;
    private CalculadoraBinariaI calcBI;
    
    
    CalculadoraAdapter(CalculadoraDecimalI calcDI, CalculadoraBinariaI calcBI){
        this.calcDI = calcDI;
        this.calcBI = calcBI;
    }
    
    @Override
    public int somar(int a, int b) {
        return this.calcDI.somar(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
        return this.calcDI.subtrair(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
         return this.calcDI.multiplicar(a, b);
    }

    @Override
    public String somar(String a, String b) {
        return this.calcBI.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
        return this.calcBI.subtrair(a, b);
    }
    
}
