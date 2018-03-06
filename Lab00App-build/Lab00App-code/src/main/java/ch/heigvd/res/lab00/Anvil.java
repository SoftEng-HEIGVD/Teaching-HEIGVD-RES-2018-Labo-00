package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 02/03/18.
 */
public class Anvil implements IInstrument {
    @Override
    public String play() {
        return "sound of an anvil";
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSoundVolume() {
        throw new UnsupportedOperationException();
    }

}
