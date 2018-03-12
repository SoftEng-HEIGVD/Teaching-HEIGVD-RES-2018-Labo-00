/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Antoine Rochat
 */
public class Clavier implements IInstrument{
    @Override
    public String play() {
        return "do re mi fa sol la si";
    }

    @Override
    public String getColor() {
        return "black and white bro";
    }

    @Override
    public int getSoundVolume() {
        return 17;

    }
}
