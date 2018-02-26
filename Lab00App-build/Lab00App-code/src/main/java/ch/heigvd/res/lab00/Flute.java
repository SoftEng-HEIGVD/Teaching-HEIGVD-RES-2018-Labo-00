package ch.heigvd.res.lab00;

public class Flute implements IInstrument{

    private String sound;
    private int soundVolume;
    private String color;

    public Flute(){
        sound = "fioooouuuuu";
        soundVolume = 25;
        color = "brown";
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