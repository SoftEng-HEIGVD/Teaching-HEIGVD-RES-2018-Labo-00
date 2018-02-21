package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    public Trumpet(){
        this.son = "pouet";
        this.volume = 50;
    }

    public String play(){
        return son;
    }

    public int getSoundVolume(){
        return volume;
    }

    public String getColor(){
        return color;
    }

    private final String color = "golden";
    private final String son;
    private int volume;
}