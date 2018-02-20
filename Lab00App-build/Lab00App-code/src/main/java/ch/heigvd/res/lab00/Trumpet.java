package ch.heigvd.res.lab00;

/**
 *
 * @author Vincent Guidoux
 */
public class Trumpet implements IInstrument {

   @Override
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return 50;
   }

   @Override
   public String getColor() {
      return "golden";
   }
   
}
