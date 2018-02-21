package ch.heigvd.res.lab00;


public interface IInstrument {
   int getSoundVolume();

   default String play(){
      return "lalalaaaa";
   }

   default String getColor(){
      return "none";
   }
}