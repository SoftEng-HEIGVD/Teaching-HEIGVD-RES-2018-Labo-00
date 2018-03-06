package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class Accordion implements IInstrument {

    @Override
    public String play() {
        return "what?";
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
