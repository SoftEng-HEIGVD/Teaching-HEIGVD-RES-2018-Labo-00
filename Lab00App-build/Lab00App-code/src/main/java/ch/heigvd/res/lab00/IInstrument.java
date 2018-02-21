package ch.heigvd.res.lab00;

/**
 * @author Marc Labie
 */

abstract public class IInstrument {
    private String sound;
    private String color;
    private int soundVolume;

    public IInstrument(String sound, String color, int soundVolume){
        this.sound       = sound;
        this.color       = color;
        this.soundVolume = soundVolume;
    }

    public String play(){
        return sound;
    }

    public String getColor(){
        return color;
    }

    public int getSoundVolume(){
        return soundVolume;
    }

}
