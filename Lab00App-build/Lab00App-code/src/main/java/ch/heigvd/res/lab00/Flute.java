package ch.heigvd.res.lab00;

public class Flute implements IInstrument{
	public String play() {
		return "tut tut";
	}
	
	public int getSoundVolume() {
		return 1;
	}
	
	public String getColor() {
		return "green";
	}
}
