package ch.heigvd.res.lab00;

/** 
 * @author Samuel Mayor
 */

public class Flute implements IInstrument {
    @Override
    public String play() {
        return "fliveliveli";
    }
    
    @Override
    public int getSoundVolume() {
        return 5;
    }
    
    @Override
    public String getColor() {
        return "black";
    }
}
