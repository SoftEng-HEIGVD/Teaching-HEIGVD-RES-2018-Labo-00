/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *this class represent the new instrument
 * @author zacharie
 */
public class Alphorn implements IInstrument{
    
public Alphorn(){}

    @Override
    public String play(){
        return "bum-bum";
    }
    @Override
     public int getSoundVolume(){
        return 9;
    }
    @Override
    public String getColor(){
        return "green";
    }
      
    @Override
    public boolean getMostImportant(){
        return true;
    }
}
