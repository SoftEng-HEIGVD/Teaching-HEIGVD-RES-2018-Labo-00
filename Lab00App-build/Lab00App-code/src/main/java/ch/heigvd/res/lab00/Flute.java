package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    String sound = "uuuuuu";
    String color = "green";
    int volume = 2;

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