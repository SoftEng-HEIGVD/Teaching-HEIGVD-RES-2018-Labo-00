package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument{
    private int soundVolume;
    private String sound;
    private String color;

    public Trumpet(){
        soundVolume = 100;
        sound = "pouet";
        color = "golden";
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
