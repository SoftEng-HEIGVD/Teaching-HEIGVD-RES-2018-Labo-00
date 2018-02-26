package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument{

    private String sound;
    private int soundVolume;
    private String color;

    public Trumpet(){
        sound = "pouet";
        soundVolume = 50;
        color = "golden";
    }

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