package exam;

public abstract  class MusicInstrument implements MarketItem {

	private final  int price;
	private final boolean isNew;
	public MusicInstrument(int price, boolean isNew) {
		this.price = price;
		this.isNew = isNew;
	}
	@Override
	public  int getPrice(){
		return price;
	}
	@Override
	public boolean isNew(){
		return this.isNew;
	}
	@Override
	public boolean canMakeNoice() {
		return true;
	}
}
