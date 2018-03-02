<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author olivier
 */
public class Flute implements IInstrument {

   public String play() {
      return "";
   }

   public String getColor() {
      return "";
   }

   public int getSoundVolume() {
      return 5;
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
>>>>>>> bc7ea89dbbce94afc47a9131eb9afe0b3a5b9bf5
}
