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
 *this class should test the Alphorn instrument
 * @author zacharie
 */
public class AlphornTest {
  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndAAlphornClass() {
    IInstrument alphorn = new Alphorn();
    assertNotNull(alphorn);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument alphorn = new Alphorn();
    String sound = alphorn.play();
    assertNotNull(sound);
  }
  
  @Test
  public void anAlphornShouldMakebumbum() {
    IInstrument alphorn = new Alphorn();
    String sound = alphorn.play();
    Assert.assertEquals("bum-bum", sound);
  }
 
  @Test
  public void anAlphornShouldNotBeLouderThanATrumpet() {
    IInstrument alphorn = new Alphorn();
    IInstrument trumpet = new Trumpet();
    int alphornVolume = alphorn.getSoundVolume();
    int trumpetVolume = trumpet.getSoundVolume();
    Assert.assertTrue(alphornVolume < trumpetVolume);
  }

  @Test
  public void anAlphornShouldBeGreen() {
    IInstrument alphorn = new Alphorn();
    String color = alphorn.getColor();
    Assert.assertEquals("green", color);
  }
  
  
}
