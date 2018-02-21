/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author zacharie
 */
public class Flute implements IInstrument{
    private int volume;
    
    public Flute(){}
    @Override
    public String play(){
        return "poum-poum";
    }
    @Override
     public int getSoundVolume(){
        return 10;
    }
      @Override
      public String getColor(){
        return "red";
    }
    
    
    
}
