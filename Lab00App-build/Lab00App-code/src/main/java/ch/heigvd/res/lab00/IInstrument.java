/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.res.lab00;

/*
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : IInstrument.java
 Auteur(s)   : Labinot Rashiti
 Date        : 21.02.2018

 But         : Fichier contenant l'interface instrument

 Remarque(s) : Un instrument se doit de pouvoir être joué et donner un niveau sonore.

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public interface IInstrument {
   public int getSoundVolume();
   public String play();
   public String getColor();
}
