package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument{
    
    String sound = "pouet";
    String color = "golden";
    int volume = 3;

    public String play(){
        return sound;
    }

    public int getSoundVolume() {
        return volume;
    }

    public String getColor(){
        return color;
    }
}
