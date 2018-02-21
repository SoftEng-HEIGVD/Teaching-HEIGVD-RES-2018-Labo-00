package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

   private String color = "golden";

   public String play(){
      return "pouet";
   }

   public int getSoundVolume(){
      return 10;
   }

   public String getColor(){
      return color;
   }
}
