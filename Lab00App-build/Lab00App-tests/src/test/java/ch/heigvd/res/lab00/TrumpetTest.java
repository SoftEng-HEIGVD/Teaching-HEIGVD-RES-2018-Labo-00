package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *       *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 *
 * This file is used to specify what you have to implement. To check your work, we
 * will run our own copy of the automated tests. If you change this file, then you
 * will introduce a change of specification!!!
 *
 * @author Olivier Liechti
 */
public class TrumpetTest {

   @Test
   public void thereShouldBeAnIInstrumentInterfaceAndATrumpetClass() {
      IInstrument trumpet = new Trumpet();
      assertNotNull(trumpet);
   }

   @Test
   public void itShouldBePossibleToPlayAnInstrument() {
      IInstrument trumpet = new Trumpet();
      String sound = trumpet.play();
      assertNotNull(sound);
   }

   @Test
   public void aTrumpetShouldMakePouet() {
      IInstrument trumpet = new Trumpet();
      String sound = trumpet.play();
      Assert.assertEquals("pouet", sound);
   }

   @Test
   public void aTrumpetShouldBeLouderThanAFlute() {
      IInstrument trumpet = new Trumpet();
      IInstrument flute = new Flute();
      int trumpetVolume = trumpet.getSoundVolume();
      int fluteVolume = flute.getSoundVolume();
      Assert.assertTrue(trumpetVolume > fluteVolume);
   }

   @Test
   public void aTrumpetShouldBeGolden() {
      IInstrument trumpet = new Trumpet();
      String color = trumpet.getColor();
      Assert.assertEquals("golden", color);
   }

}
