package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class Flute implements IInstrument {
    @Override
    public String play() {
        return "pfuit";
    }

    @Override
    public String getColor() {
        return "silver";
    }

    @Override
    public int getSoundVolume() {
        return 3;

    }
}
