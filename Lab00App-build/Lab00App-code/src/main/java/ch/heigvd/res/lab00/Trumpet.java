package ch.heigvd.res.lab00;

/**
 *
 * @author Adam Zouari
 */
public class Trumpet implements IInstrument{
    
    private String sound, color;
    private int volume;

    public Trumpet() {
        this.sound = "pouet";
        this.color = "golden";
        this.volume = 80;
    }
    
    public String play()
    {
        return sound;
    }
    
    public int getSoundVolume()
    {
        return volume;
    }
    
    public String getColor()
    {
        return color;
    }
    
}
