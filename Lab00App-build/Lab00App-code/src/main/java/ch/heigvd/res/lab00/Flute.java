package ch.heigvd.res.lab00;

/**
 * Created on 21.02.18.
 *
 * @author Max
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "fuuuuuit";
    }

    @Override
    public int getSoundVolume() {
        return 3;
    }

    @Override
    public String getColor() {
        return "wooden";
    }
}
