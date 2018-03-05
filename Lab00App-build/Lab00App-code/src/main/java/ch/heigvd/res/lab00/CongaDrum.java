/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author fidimala
 */
public class CongaDrum implements IInstrument{
    @Override
    public String play(){
        return "poum poum";
    }
    
    @Override
    public int getSoundVolume(){
        return 5;
    }
    
    @Override
    public String getColor(){
        return "Brownish Red";
    }
    
    public Boolean isCubanInstrument(){
        return true;
    }
    
}
