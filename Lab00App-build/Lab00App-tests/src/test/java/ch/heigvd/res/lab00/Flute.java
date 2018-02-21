package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    public Flute() {};


    public String play(){
        return "dou-dou-wa, dou-dou-wa";
    }

    public int getSoundVolume() {
        return 1;
    }
}
