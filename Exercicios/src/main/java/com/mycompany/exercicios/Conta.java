/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicios;

/**
 *
 * @author berna
 */
public class Conta {
    public static void main(String[] args) {
Conta minhaConta;
minhaConta = new Conta();
minhaConta.titular = "Duke";
minhaConta.saldo = 1000.0;
System.out.println("Saldo atual: " + minhaConta.saldo);
}
}