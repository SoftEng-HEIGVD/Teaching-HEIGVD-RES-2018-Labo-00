package ch.heigvd.res.lab00;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class AccordionTest {

    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument accordion = new Accordion();
        String sound = accordion.play();
        assertNotNull(sound);
    }

}
