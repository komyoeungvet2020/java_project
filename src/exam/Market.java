package exam;

import java.util.ArrayList;
import java.util.List;

public class Market {

	private List<MarketItem> items;
	public Market() {
		this.items = new ArrayList<>();
	}
	public List<MarketItem> getItems() {
		return items;
	}
	public void addItem(MarketItem item){
		this.items.add(item);
	}
	public List<MarketItem> getNewItemsBelowOrEqualTo(int price){
		List<MarketItem> result= new ArrayList<MarketItem>();
		for(MarketItem market : this.items) {
			if (market.getPrice() <= price && market.isNew() == true){
				result.add(market);
			}
		}
		return result;
	}
	public int getNumberOfSecondHand() {
		int count = 0;
		for (MarketItem marketItem :this.items) {
			if(marketItem.isNew() == false) {
				count++;
			}
		}
		return count;
	}
	public boolean atLeast3ItemMakeNoise() {
		int count = 0;
		for (MarketItem marketItem : this.items) {
			if(marketItem.canMakeNoice()) {
				count++;
			}
			if(count >= 3) {
				return true;
			}
		}
		return false;
	}
}

