package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ClarinetTest {

  
  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndAClarinetClass() {
    IInstrument clarinet = new Clarinet();
    assertNotNull(clarinet);
  }
  
  @Test
  public void itShouldBePossibleToPlayClarinet() {
    IInstrument clarinet = new Clarinet();
    String sound = clarinet.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aCLarinetShouldMakeTut() {
    IInstrument clarinet = new Clarinet();
    String sound = clarinet.play();
    Assert.assertEquals("tut", sound);
  }
  
  @Test
  public void aClarinetShouldBeLouderThanAFlute() {
    IInstrument clarinet = new Clarinet();
    IInstrument flute = new Flute();
    int clarinetVolume = clarinet.getSoundVolume();
    int fluteVolume = flute.getSoundVolume();
    Assert.assertTrue(clarinetVolume > fluteVolume);
  }

  @Test
  public void aClarinetShouldBeBlack() {
    IInstrument clarinet = new Clarinet();
    String color = clarinet.getColor();
    Assert.assertEquals("black", color);
  }
  
 
}
