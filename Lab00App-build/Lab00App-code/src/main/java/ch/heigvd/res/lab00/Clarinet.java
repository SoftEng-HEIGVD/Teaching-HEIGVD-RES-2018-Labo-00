

package ch.heigvd.res.lab00;

/**
 *
 * @author Adam Zouari
 */
public class Clarinet implements IInstrument{
    
    private String sound, color;
    private int volume;

    public Clarinet() {
        this.sound = "tut";
        this.color = "black";
        this.volume = 60;
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