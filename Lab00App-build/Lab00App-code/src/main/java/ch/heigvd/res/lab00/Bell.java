package ch.heigvd.res.lab00;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    @Override
    public int getSoundVolume() {
        throw new NotImplementedException();
    }

}
