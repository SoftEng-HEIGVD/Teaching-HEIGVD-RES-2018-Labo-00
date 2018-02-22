package ch.heigvd.res.lab00;

/**
 * Fits the TrumpetTest Requirements
 * @author Adrien Allemand
 */
 
 public class Trumpet implements IInstrument {
	 public Trumpet(){};

	 public String play(){
	     return "pouet";
     }

     public int getSoundVolume() {
	     return 2;
     }

     public String getColor(){
	     return "golden";
     }
 }