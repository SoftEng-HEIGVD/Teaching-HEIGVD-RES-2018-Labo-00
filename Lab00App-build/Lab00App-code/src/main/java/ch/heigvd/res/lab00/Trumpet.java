package ch.heigvd.res.lab00;

/**
 *
 * @author Yosra
 */
public class Trumpet implements IInstrument{
    public Trumpet(){
        sound = "pouet";
        color = "golden";
        soundVolume = 100;
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