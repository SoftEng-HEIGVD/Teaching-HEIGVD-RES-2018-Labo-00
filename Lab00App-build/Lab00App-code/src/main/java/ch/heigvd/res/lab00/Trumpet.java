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
public class Trumpet implements IInstrument {

   public String play() {
      return "pouet";
   }

   public String getColor() {
      return "golden";
   }

   public int getSoundVolume() {
      return 10;
   }
=======
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
    }
>>>>>>> bc7ea89dbbce94afc47a9131eb9afe0b3a5b9bf5

}
