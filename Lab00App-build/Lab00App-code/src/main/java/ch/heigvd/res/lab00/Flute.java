package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    @Override
    public String play(){
        return "poupoupou";
    }

    @Override
    public String getColor(){
        return "silver";
    }
    
    @Override
    public int getSoundVolume(){
        return 3;
    }

}
