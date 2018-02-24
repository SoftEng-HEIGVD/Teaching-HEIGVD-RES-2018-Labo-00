package ch.heigvd.res.lab00;

/**
 *
 * @author Zied Naimi
 */
public class Flute implements IInstrument {
    
    public String play() {
        return "pouet";
    }

    public int getSoundVolume() {
        return 5;
    }
    public String getColor() {
        return "not golden";
    }
}
