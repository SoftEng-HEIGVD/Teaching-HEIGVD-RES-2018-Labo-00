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
 * @author Rafidimalala
 */
public class CongaDrumTest {
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument congaDrum = new CongaDrum();
    String sound = congaDrum.play();
    assertNotNull(sound);
  }
  
    @Test
  public void aCongaDrumShouldMakePoumPoum() {
    IInstrument congaDrum = new CongaDrum();
    String sound = congaDrum.play();
    Assert.assertEquals("poum poum", sound);
  }

  @Test
  public void aCongaDrumShouldBeBrownishRed() {
    IInstrument congaDrum = new CongaDrum();
    String color = congaDrum.getColor();
    Assert.assertEquals("brownish red", color);
  }

    @Test
  public void aCongaDrumShouldbeCubanInstrument() {
    IInstrument congaDrum = new CongaDrum();
    Assert.assertEquals(true, congaDrum.play());
  }  
}
