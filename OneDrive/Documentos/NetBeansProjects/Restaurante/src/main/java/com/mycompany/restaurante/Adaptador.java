/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author lucas
 */
public class Adaptador implements Cozinha {
    private Macarrao macarrao;

    public Adaptador() {
        this.macarrao = new Macarrao();
    }

    @Override
    public void cozinhar() {
        macarrao.cozinharMacarrao();
    }
}

