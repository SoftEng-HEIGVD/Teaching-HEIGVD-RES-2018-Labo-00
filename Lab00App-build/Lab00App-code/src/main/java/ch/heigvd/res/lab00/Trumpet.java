package ch.heigvd.res.lab00;

/**
 * @author Daniel Gonzalez Lopez
 */
public class Trumpet implements IInstrument {
    public Trumpet() { }

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 42;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}