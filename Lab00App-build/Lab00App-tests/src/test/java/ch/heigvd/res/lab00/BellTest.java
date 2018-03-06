package ch.heigvd.res.lab00;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Romain Silvestri on 03/03/18.
 */
public class BellTest {
    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument bell = new Bell();
        String sound = bell.play();
        assertNotNull(sound);
    }

}