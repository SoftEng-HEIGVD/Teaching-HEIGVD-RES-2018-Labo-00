package ch.heigvd.res.lab00;

/**
 *
 * @author Léo
 */

public class Cowbell implements IInstrument{
    int soundVolume;
    String color;
    private int tempoBPM;

    public Cowbell(int soundVolume, String color, int tempoBPM){
        this.soundVolume = soundVolume;
        this.color = color;
        this.tempoBPM = tempoBPM;
    }
    
    public Cowbell(){
        soundVolume = 50;
        color = "Silver";
        tempoBPM = 120;
    }

    public String play(){
        return "Clong Clong";
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
    
    public String getColor(){
        return color;
    }
}