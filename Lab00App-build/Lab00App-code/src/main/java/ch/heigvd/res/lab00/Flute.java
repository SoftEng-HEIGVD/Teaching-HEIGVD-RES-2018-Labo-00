package ch.heigvd.res.lab00;

/**
 *
 * @author Alexandra Korukova
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "wee";
    }

    @Override
    public int getSoundVolume() {
        return 1;
    }

    @Override
    public String getColor() {
        return "silver";
    }
    
}
