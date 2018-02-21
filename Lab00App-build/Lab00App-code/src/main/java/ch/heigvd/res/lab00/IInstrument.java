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
public class IInstrument {
    private int soundVolume;
    private String color;
    
    public IInstrument(){
        
    }
    
    public IInstrument(int soundVolume){
        this.soundVolume = soundVolume;
    }
    
    public IInstrument(int soundVolume, String color){
        this.soundVolume = soundVolume;
        this.color = color;
    }
    
    public String play(){
        return "";
    }
    
    public String getColor(){
        return color;
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
}
