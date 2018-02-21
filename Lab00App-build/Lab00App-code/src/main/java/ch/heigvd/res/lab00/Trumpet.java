package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {
    private String sound = "pouet";
    private String color = "golden";
    private int soundVolume = 10;

    public String play(){
        return sound;
    }

    public int getSoundVolume(){
        return soundVolume;
    }

    public String getColor(){
        return color;
    }
}
