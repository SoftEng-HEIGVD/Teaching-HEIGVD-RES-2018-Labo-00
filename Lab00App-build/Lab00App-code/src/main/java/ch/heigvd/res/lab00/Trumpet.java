package ch.heigvd.res.lab00;

/**
 * Created on 21.02.18.
 *
 * @author Max
 */
public class Trumpet implements IInstrument {

    @Override
    public String play () {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 6;
    }

    @Override
    public String getColor () {
        return "golden";
    }
}
