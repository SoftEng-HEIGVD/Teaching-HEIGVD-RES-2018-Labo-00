/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Jimmy Verdasca
 */
public abstract class SimpleInstrument implements IInstrument{
   
   protected String sound;
   protected int volume;
   protected String color;
   
   public SimpleInstrument(String sound, int volume, String color) {
      this.sound = sound;
      this.volume = volume;
      this.color = color;
   }
   
   @Override
   public String play() {
      return sound;
   }

   @Override
   public int getSoundVolume() {
      return volume;
   }
   
   @Override
   public String getColor() {
      return color;
   }
}
