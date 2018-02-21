package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument{
	@Override
	public String play(){
		return "pouet";
	}
	
	@Override
	public int getSoundVolume() {
		return 100;
	}
	
	@Override
	public String getColor() {
		return "golden";
	}
}
