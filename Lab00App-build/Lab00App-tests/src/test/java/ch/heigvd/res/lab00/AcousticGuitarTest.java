package ch.heigvd.res.lab00;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class AcousticGuitarTest {

    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument acousticGuitar = new AcousticGuitar();
        String sound = acousticGuitar.play();
        assertNotNull(sound);
    }

}
