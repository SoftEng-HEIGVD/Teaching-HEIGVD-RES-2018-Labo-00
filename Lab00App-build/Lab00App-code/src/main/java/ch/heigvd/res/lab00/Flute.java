 fb-alphorn
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
    
    
    
=======
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
    }
 master
}
