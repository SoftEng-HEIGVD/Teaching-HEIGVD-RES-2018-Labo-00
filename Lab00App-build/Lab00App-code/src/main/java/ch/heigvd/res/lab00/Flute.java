package ch.heigvd.res.lab00;

public class Flute implements IInstrument{
    private int soundVolume;
    private String sound;
    private String color;

    public Flute(){
        soundVolume = 50;
        sound = "Flute sound";
        color = "wooden";
    }
    public String play(){
        return sound;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }
}
