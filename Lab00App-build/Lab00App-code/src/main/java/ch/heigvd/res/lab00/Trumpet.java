/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.res.lab00;

/*
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : Trumpet.java
 Auteur(s)   : Labinot Rashiti
 Date        : 21.02.2018

 But         : Fichier contenant la classe Trumpet

 Remarque(s) : Implémente l'interface IInstrument

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public class Trumpet implements IInstrument {
   public Trumpet() {
      
   }
   
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return 10;
   }
   
   public String getColor() {
      return "golden";
   }
   
}
