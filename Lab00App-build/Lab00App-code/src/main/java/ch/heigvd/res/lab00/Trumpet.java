<<<<<<< HEAD
package ch.heigvd.res.lab00;


/**
 * Created by Olivier Liechti on 28/02/18.
 */
class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 8;
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
public class Trumpet implements IInstrument {
    public String play(){
        return "pouet";
    }
    
    public int getSoundVolume(){
        return 80;
    }
    
    public String getColor(){
         return "golden";
>>>>>>> master
    }
}
