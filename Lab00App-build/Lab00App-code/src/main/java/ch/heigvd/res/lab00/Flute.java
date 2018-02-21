package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
	@Override
	public String play() {
		return "fluuuuuuu";
	}
	
	@Override
	public int getSoundVolume() {
		return 50;
	}
	
	@Override
	public String getColor() {
		return "gray";
	}
}
