/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Nair Alic
 */
public class Cello implements IInstrument {
   @Override
   public String play() {
      return "viuuuviuuu";
   }
   
   @Override
   public int getSoundVolume() {
      return 150;
   }
   
   @Override
   public String getColor() {
       return "brown";
    }
   
}
