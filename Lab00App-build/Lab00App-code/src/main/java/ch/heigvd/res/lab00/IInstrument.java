package ch.heigvd.res.lab00;

/**
 * @Author: Mentor Reka
 * @Project: Lab00App - RES
 * @Description: Instrument interface which contains basics methods for instruments.
 * @Date: 20.02.2018
 */
public interface IInstrument {

    // itShouldBePossibleToPlayAnInstrument
    public String play();

    public int getSoundVolume();

    public String getColor();
}
