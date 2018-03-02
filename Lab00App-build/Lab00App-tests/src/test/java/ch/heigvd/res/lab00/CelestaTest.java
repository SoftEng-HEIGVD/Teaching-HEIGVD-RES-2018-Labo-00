/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Nair
 */
public class CelestaTest {
   @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument anvil = new Anvil();
        String sound = anvil.play();
        assertNotNull(sound);
    }
  
}
