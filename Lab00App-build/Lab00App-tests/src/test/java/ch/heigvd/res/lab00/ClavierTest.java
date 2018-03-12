/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;

/**
 *
 * @author Antoine Rochat
 */
public class ClavierTest {
    public void aClavierShouldBeGolden() {
    IInstrument clavier = new Clavier();
    String color = clavier.getColor();
    Assert.assertEquals("golden", color);
  }
}
