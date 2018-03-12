/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.res.lab00;

/*
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : Harmonica.java
 Auteur(s)   : Labinot Rashiti
 Date        : 02.03.2018

 But         : Fichier contenant la classe Harmonica

 Remarque(s) : Implémente l'interface IInstrument

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public class Harmonica implements IInstrument {
   public Harmonica() {
      
   }

   public String play() {
      return "touet";
   }
   
   @Override
   public int getSoundVolume() {
      return 7;
   }

   @Override
   public String getColor() {
      return "silver";
   }
   
   
   
   
}
