package ch.heigvd.res.lab00;

/**
 * @author Daniel Gonzalez Lopez
 */
public class Flute implements IInstrument {
    public Flute() {}

    @Override
    public String play() {
        return "";
    }

    @Override
    public int getSoundVolume() {
        return 23;
    }

    @Override
    public String getColor() {
        return "black";
    }
}
