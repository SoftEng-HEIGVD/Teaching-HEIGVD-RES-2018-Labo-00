package ch.heigvd.res.lab00;

/**
 * @Author: Mentor Reka
 * @Project: Lab00App - RES
 * @Description: Trumpet
 * @Date: 20.02.2018
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 1000;
    }

    @Override
    public String getColor() {
        return "golden";
    }

}
