/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author dorianekaffo
 */
public class Saxophone implements IInstrument {
    @Override
    public String play() {
        return  "tuintuin"; 
    }

    @Override
    public int getSoundVolume() {
        return 20;
    }

    @Override
    public String getColor() {
        return "gray"; 
    }
    
}
