package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    public Trumpet(){
        this("pouet");
    };
    public Trumpet(String sound){
        this.sound = sound;
    }

    public String play(){
        return sound;
    }

    public int getSoundVolume(){
        return volume;
    }

    public String getColor(){
        return COLOR;
    }
    private int volume = 2;
    private final static String COLOR = "golden";
    private String sound;
}
