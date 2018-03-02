package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 8;
    }

}
