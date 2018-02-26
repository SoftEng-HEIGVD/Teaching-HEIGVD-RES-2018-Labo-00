/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author endmon
 */
public class Flute implements IInstrument{
   private int SoundVolume;
   private String Color;
   
   public String play()
   {
      return "a";
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
