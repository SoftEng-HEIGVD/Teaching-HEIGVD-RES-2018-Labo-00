package ch.heigvd.res.lab00;

/**
 * @Author: Mentor Reka
 * @Project: Lab00App - RES
 * @Description: Flute class
 * @Date: 20.02.2018
 */

public class Flute implements IInstrument {
    @Override
    public String play() {
        return "fuuuui";
    }

    @Override
    public int getSoundVolume() {
        return 999;
    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
