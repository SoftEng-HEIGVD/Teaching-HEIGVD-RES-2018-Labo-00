package ch.heigvd.res.lab00;

/**
 *
 * @author Yosra
 */
public class Flute implements IInstrument{
    public Flute(){
        sound = "tootle-too";
        color = "silver";
        soundVolume = 50;
    }
    @Override
    public String play(){
        return sound;
    }
    @Override
    public String getColor(){
        return color;
    }
    
    @Override
    public int getSoundVolume(){
        return soundVolume;
    }
    
    private final String sound;
    private final String color;
    private final int soundVolume;
}