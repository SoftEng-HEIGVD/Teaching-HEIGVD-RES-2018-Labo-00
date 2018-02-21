package ch.heigvd.res.lab00;

/**
 * Class which define a trumpet
 * 
 * If you look at the class named ch.heigvd.res.lab00.TrumpetTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
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
