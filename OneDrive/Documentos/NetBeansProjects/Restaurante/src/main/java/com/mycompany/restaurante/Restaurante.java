/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

/**
 *
 * @author lucas
 */
public class Restaurante{
    public static void main(String[] args) {
        Cozinha cozinheiroArroz = new CozinheiroArroz();
        Cozinha cozinheiroFeijao = new CozinheiroFeijao();
        Cozinha adaptadorMacarrao = new Adaptador();

        cozinheiroArroz.cozinhar();
        cozinheiroFeijao.cozinhar();
        adaptadorMacarrao.cozinhar();
    }
}
