<<<<<<< HEAD
package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class Flute implements IInstrument {
    @Override
    public String play() {
        return "pfuit";
    }

    @Override
    public String getColor() {
        return "silver";
    }

    @Override
    public int getSoundVolume() {
        return 3;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Antoine Rochat
 */
public class Flute implements IInstrument {
    public String play(){
        return "tududu";
    }
    
    public int getSoundVolume(){
        return 60;
    }
    
    public String getColor(){
        return "white";
>>>>>>> master
    }
}
