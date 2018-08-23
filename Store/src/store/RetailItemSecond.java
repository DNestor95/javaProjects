package store;

public class RetailItemSecond {
public static void main (String[] args){
	
	RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
	RetailItem item2 = new RetailItem("Designer Jacket", 40, 34.95);
	RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
	
	
	System.out.println("			Description		Units on Hand		price");
	System.out.println("----------------------------------------------------------------------------------------------");

	System.out.println("item #1			" + item1.getDescription() + "			" + item1.getUnitsOnHand() + "			" + item1.getPrice());
	System.out.println("item #2			" + item2.getDescription() + "		" + item2.getUnitsOnHand() + "			" + item2.getPrice());
	System.out.println("item #3			" + item3.getDescription() + "			" + item3.getUnitsOnHand() + "			" + item3.getPrice());

}
}
