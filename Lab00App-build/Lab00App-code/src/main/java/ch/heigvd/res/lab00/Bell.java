package ch.heigvd.res.lab00;

/**
 * Created by Romain Silvestri on 03/03/18.
 */
public class Bell implements IInstrument {
    @Override
    public String play() {
        return "ding";
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
