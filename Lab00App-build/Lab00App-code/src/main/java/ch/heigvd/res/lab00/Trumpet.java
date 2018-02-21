package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

   private static final String COLOR  = "golden";
   private static final String SOUND  =  "pouet";
   private static final int    SOUND_VOLUME = 50; 
   
   @Override
   public String play() {
      return SOUND;
   }

   @Override
   public int getSoundVolume() {
      return SOUND_VOLUME;
   }
   
   @Override
   public String getColor() {
      return COLOR;
   }

}
