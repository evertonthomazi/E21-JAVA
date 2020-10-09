/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

/**
 *
 * @author Proway
 */
public class Gato extends Pet {

    public String mia() {
        return new String("Miau!");
    }

    @Override
    public String emiteSom() {
        return mia();
    }
}
