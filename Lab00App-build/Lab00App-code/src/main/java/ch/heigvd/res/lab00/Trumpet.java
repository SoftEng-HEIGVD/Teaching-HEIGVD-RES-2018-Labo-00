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
public class Trumpet implements IInstrument{
    private String sound = "pouet";
    public String play(){
      return this.sound;  
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }
    
    public String getColor() {
        return "golden";
    }
    
}
