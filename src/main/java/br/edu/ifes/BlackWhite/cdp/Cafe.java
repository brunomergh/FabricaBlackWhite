/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20131bsi0033
 */
public class Cafe {
    private double preco;
    private ArrayList<Ingrediente> ingredientes;
    private final int qtdAgua = 100;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
