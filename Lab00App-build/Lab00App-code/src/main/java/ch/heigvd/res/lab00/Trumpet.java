package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    public String getColor(){
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 1;
    }

    public Trumpet(){

    }
}
