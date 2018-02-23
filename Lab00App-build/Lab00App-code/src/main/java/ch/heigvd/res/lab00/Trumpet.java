package ch.heigvd.res.lab00;

/**
 *
 * @author Schurch Loic
 */
public class Trumpet implements IInstrument{
   
   private static final String SOUND = "pouet";
   private static final int SOUND_VOLUME = 10;
   private static final String COLOR = "golden";
   
   public String play() {
      return SOUND;
   }
   
   public int getSoundVolume() {
      return SOUND_VOLUME;
   }
   
   public String getColor() {
      return COLOR;
   }
   
}
