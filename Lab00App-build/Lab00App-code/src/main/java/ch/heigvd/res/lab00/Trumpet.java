
package ch.heigvd.res.lab00;

/**
 *
 * @author endmon
 */
public class Trumpet implements IInstrument{
   private int SoundVolume = 45;
   private String Color = "golden";
   
   public String play()
   {
      return "pouet";
   }
   
   public int getSoundVolume()
   {
      return SoundVolume;
   }
   
   public String getColor()
   {
      return Color;
   }
}
