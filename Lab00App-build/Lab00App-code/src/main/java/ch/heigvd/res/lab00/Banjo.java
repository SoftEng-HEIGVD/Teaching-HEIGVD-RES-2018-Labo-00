package ch.heigvd.res.lab00;

public class Banjo implements IInstrument {

   private String color = "black";

   public String play(){
      return "bling";
   }

   public int getSoundVolume(){
      return 6;
   }

   public String getColor(){
      return color;
   }

}
