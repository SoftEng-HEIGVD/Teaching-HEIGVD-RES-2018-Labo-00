package ch.heigvd.res.lab00;

/**
 *
 * @author Schurch Loic
 */
public class Flute implements IInstrument{
   
   private static final String SOUND = "fuuut";
   private static final int SOUND_VOLUME = 5;
   private static final String COLOR = "yellow";
   
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
