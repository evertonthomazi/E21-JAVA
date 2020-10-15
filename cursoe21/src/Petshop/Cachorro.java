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
public class Cachorro extends Pet {

    public String late() {
        return new String("Auau!");
    }

    @Override
    public String emiteSom() {
        return late();
    }
}
