package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class CowbellTest {

    private static int nb = 0;

    @BeforeAll
    public static void setUpBeforeClass () throws Exception {
        System.out.println("==== Cowbell tests beginning ====");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Test number : " + ++nb);
    }

    @Test
    public void thereShouldBeAnIInstrumentInterfaceAndATrumpetClass() {
        IInstrument cowbell = new Cowbell();
        assertNotNull(cowbell);
    }

    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument cowbell = new Cowbell();
        String sound = cowbell.play();
        assertNotNull(sound);
    }

    @Test
    public void aTrumpetShouldMakeClongClong() {
        IInstrument cowbell = new Cowbell();
        String sound = cowbell.play();
        Assert.assertEquals("Clong Clong", sound);
    }
}
