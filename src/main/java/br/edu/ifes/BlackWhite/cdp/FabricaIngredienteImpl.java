/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaIngredienteImpl implements  FabricaIngrediente{

    @Override
    public Ingrediente criarIngrediente() {
        return new Ingrediente();
    }
    
}
