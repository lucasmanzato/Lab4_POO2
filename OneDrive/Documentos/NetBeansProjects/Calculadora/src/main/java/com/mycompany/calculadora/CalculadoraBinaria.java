/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author lucas
 */
public class CalculadoraBinaria implements CalculadoraBinariaI{

    @Override
    public String somar(String a, String b) {
        // Verificar se as strings de entrada são nulas ou vazias
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("As entradas não podem ser nulas ou vazias.");
        }

        // Obter o comprimento máximo das duas strings
        int maxLength = Math.max(a.length(), b.length());

        // Preencher as strings com zeros à esquerda para torná-las do mesmo comprimento
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        // Iterar da direita para a esquerda, somando os bits correspondentes e considerando o carry
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';

            int soma = bitA + bitB + carry;
            resultado.insert(0, soma % 2);
            carry = soma / 2;
        }

        // Se houver um carry restante, adicioná-lo ao resultado
        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    @Override
    public String subtrair(String a, String b) {
        // Verificar se as strings de entrada são nulas ou vazias
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("As entradas não podem ser nulas ou vazias.");
        }

        // Obter o comprimento máximo das duas strings
        int maxLength = Math.max(a.length(), b.length());

        // Preencher as strings com zeros à esquerda para torná-las do mesmo comprimento
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        StringBuilder resultado = new StringBuilder();
        int borrow = 0;

        // Iterar da direita para a esquerda, subtraindo os bits correspondentes e considerando o borrow
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';

            // Subtração com empréstimo
            int diferenca = bitA - bitB - borrow;

            // Se a diferença for negativa, adicionamos 2 ao resultado e ajustamos o empréstimo
            if (diferenca < 0) {
                diferenca += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultado.insert(0, diferenca % 2);
        }

        return resultado.toString();
    }
}