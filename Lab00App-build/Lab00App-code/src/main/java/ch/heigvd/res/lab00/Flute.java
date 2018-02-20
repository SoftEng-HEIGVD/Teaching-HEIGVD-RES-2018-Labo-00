
package ch.heigvd.res.lab00;

/**
 *
 * @author Adam Zouari
 */
public class Flute implements IInstrument {
    
    private String sound, color;
    private int volume;

    public Flute() {
        this.sound = "tut";
        this.color = "white";
        this.volume = 40;
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
