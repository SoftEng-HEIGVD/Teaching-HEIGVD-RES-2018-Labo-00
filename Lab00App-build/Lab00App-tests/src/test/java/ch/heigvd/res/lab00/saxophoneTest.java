/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author dorianekaffo
 */
public class saxophoneTest {
    
    @Test
  public void thereShouldBeAnIInstrumentInterfaceAndASaxophoneClass() {
    IInstrument saxophone  = new Saxophone();
    assertNotNull(saxophone);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument saxophone  = new Saxophone();
    String sound = saxophone.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aTrumpetShouldMaketuintuin() {
    IInstrument saxophone  = new Saxophone();
    String sound = saxophone.play();
    Assert.assertEquals("tuintuin", sound);
  }
  
  @Test
  public void aSaxophoneShouldBeLouderThanATrumpet() {
   IInstrument saxophone  = new Saxophone();
    IInstrument trumpet = new Trumpet();
    int saxophoneVolume = saxophone.getSoundVolume();
    int trumpetVolume = trumpet.getSoundVolume();
    Assert.assertTrue(saxophoneVolume > trumpetVolume);
  }

  @Test
  public void aSaxophoneShouldBeGray() {
    IInstrument saxophone  = new Saxophone();
    String color = saxophone.getColor();
    Assert.assertEquals("gray", color);
  }
  
}