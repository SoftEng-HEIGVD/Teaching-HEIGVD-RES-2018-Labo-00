package ch.heigvd.res.lab00;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    @Override
    public int getSoundVolume() {
        throw new NotImplementedException();
    }

}
