package ch.heigvd.res.lab00;

/**
 *
 * @author Léo
 */

public class Cowbell extends IInstrument{
    private int tempoBPM;

    public Cowbell(int soundVolume, String color, int tempoBPM){
        super(soundVolume,color);
        this.tempoBPM = tempoBPM;
    }

    public Cowbell(){
        new Cowbell(50, "Silver", 120);
    }

    public String play(){
        return "Clong Clong";
    }

}