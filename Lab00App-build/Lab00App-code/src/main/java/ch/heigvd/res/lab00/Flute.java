package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    @Override
    public String play() {
        return "Tutu";
    }

    @Override
    public int getSoundVolume() {
        return 0;
    }

    @Override
    public String getColor() {
        return "metal";
    }

    public Flute(){

    }
}
