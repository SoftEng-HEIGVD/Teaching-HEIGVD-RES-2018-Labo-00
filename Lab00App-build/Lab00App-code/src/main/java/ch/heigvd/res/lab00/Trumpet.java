/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Léo
 */
public class Trumpet extends IInstrument {
    private String color;
    
    public Trumpet(){
        super(100, "golden");
    }
    
    public String play(){
        return "pouet";
    }
}
