package ch.heigvd.res.lab00;

/**
 * Fits the TrumpetTest Requirements
 * @author Adrien Allemand
 */

public class Flute implements IInstrument {

    public Flute() {};


    public String play(){
        return "dou-dou-wa, dou-dou-wa";
    }

    public int getSoundVolume() {
        return 1;
    }

    public String getColor(){
        return "black";
    }
}
