package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

   private static final int SOUND_VOLUME = 30; 
   
   @Override
   public String play() {
      return null;
   }

   @Override
   public int getSoundVolume() {
      return SOUND_VOLUME;
   }

   @Override
   public String getColor() {
      return null;
   }
   
}
