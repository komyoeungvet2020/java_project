package exam;

import java.util.List;

public class Main {

	public static void main(String args[]) {
		Market newMarket = new Market();
		Book phpBook = new Book(2000, true);
		Paino myPiano = new Paino(500, true, "Honda");
		Guita myGuitar = new Guita(400, false, 6);	
		Guita myGuita = new Guita(400, false, 6);	
     
		newMarket.addItem(phpBook);
		newMarket.addItem(myPiano);
		newMarket.addItem(myGuitar);
		newMarket.addItem(myGuita);
		List<MarketItem> result = newMarket.getNewItemsBelowOrEqualTo(1000);
		System.out.println("This is a result: " + result.size());
		System.out.println("Second hand is: " + newMarket.getNumberOfSecondHand());
		System.out.println("Can make noise is :" + newMarket.atLeast3ItemMakeNoise());
	}
}
