package ch.heigvd.res.lab00;

/**
 * Class which define an intrument
 * 
 * If you look at the class named ch.heigvd.res.lab00.TrumpetTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
 *
 * @author Vincent Guidoux
 */
public interface IInstrument {
   
   /**
    * @return what the instrument plays
    */
   public String play();

   /**
    * @return the sound volume of the instrument
    */
   public int getSoundVolume();

   /**
    * @return the color of the instrument
    */
   public String getColor();
}
