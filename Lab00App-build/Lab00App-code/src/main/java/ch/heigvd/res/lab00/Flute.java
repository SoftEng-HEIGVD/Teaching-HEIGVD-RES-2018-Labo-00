package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    public Flute(){
        this("fuifuiifuiii");
    };
    public Flute(String sound){
        this.sound = sound;
    }

    public String play(){
        return sound;
    }

    public int getSoundVolume(){
        return volume;
    }

    @Override
    public String getColor() {
        return COLOR;
    }

    private int volume = 1;
    private final static String COLOR = "Yellow";
    private String sound;
}
