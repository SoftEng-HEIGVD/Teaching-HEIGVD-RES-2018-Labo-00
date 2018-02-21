package ch.heigvd.res.lab00;

/**
 *
 * @author Aurélien Siu
 */

public class Flute implements IInstrument{

    @Override
    public String play() {
       return "tutut";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        return "brown";
    }
        
}
