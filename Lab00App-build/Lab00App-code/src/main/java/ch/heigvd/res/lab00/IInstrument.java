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
public interface IInstrument {
    
   public String play();
   public int getSoundVolume();
   public String getColor();
    
=======
package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public interface IInstrument {
    public String play();
    public String getColor();
    public int getSoundVolume();
 master
}
