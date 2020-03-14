package exam;

public class Paino extends MusicInstrument {

	private final String brand;
	public Paino(int price, boolean isNew, String brand) {
		super(price, isNew);
		this.brand = brand;
	}
}
