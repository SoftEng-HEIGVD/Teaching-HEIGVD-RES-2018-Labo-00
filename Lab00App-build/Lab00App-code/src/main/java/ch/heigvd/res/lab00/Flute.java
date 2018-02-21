package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    public Flute() {
        this.volume = 10;
    }

    public int getSoundVolume() {
        return volume;
    }

    private int volume;

}