package ch.heigvd.res.lab00;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
public class AcousticGuitar implements IInstrument {
    @Override
    public String play() {
        return "tzing";
    }

    @Override
    public String getColor() {
        throw new NotImplementedException();
    }

    @Override
    public int getSoundVolume() {
        throw new NotImplementedException();
    }
}
