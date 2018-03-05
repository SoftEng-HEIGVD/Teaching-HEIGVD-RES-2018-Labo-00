package ch.heigvd.res.lab00;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Olivier Liechti on 02/03/18.
 */
public class AnvilTest {
    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument anvil = new Anvil();
        String sound = anvil.play();
        assertNotNull(sound);
    }

}
