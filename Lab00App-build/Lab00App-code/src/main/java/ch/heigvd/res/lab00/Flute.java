package ch.heigvd.res.lab00;

/**
 * Class wich define a flute
 *
 * If you look at the class named ch.heigvd.res.lab00.TrumpetTest, you will find an
 * executable specification for this class. The test methods specify the expected
 * behavior for this class.
 *
 * @author Vincent Guidoux
 */
public class Flute implements IInstrument {

   @Override
   public String play() {
      return "flute alors";
   }

   @Override
   public int getSoundVolume() {
      return 10;
   }

   @Override
   public String getColor() {
      return "white";
   }
}
