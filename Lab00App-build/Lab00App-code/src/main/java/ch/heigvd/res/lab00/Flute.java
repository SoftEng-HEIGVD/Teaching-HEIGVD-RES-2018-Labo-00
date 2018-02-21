package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

   @Override
   public String play(){
      return "Un magnifique son";
   }

   @Override
   public String getColor(){
      return "Une magnifique couleur";
   }

   @Override
   public int getSoundVolume(){
      return 5;
   }
}