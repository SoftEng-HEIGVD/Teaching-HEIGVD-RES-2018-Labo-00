/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author LNC
 */
public class Trumpet implements IInstrument 
{
    private String message = "pouet";
    private int soundVolume = 2;
    private String color = "golden";
  
  @Override
  public String play(){
      return message;
  }
  @Override
  public int getSoundVolume(){
      return soundVolume;
  }
  @Override
  public String getColor(){
      return color;
  }
    
}
