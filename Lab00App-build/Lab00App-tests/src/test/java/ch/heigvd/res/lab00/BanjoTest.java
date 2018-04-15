package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BanjoTest {
   @Test
   public void thereShouldBeABanjoClass() {
      IInstrument banjo = new Banjo();
      assertNotNull(banjo);
   }

   @Test
   public void aBanjoShouldMakeBling() {
      IInstrument banjo = new Banjo();
      String sound = banjo.play();
      Assert.assertEquals("bling", sound);
   }

   @Test
   public void aBanjotShouldBeBlack() {
      IInstrument banjo = new Banjo();
      String color = banjo.getColor();
      Assert.assertEquals("black", color);
   }
}