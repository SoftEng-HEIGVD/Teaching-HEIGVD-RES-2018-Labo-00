package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

   private String color = "wooden";

   public String play(){
      return "tut";
   }

   public int getSoundVolume(){
      return 5;
   }

   public String getColor(){
      return color;
   }

}
