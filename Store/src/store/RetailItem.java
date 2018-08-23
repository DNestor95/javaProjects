package store;
public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;
	

//mutators
	public void setDescription( String storeDescription ){
		
		description = storeDescription;
		
	}
public void setUnitsOnHand( int storeUnitsOnHand ){
		
	unitsOnHand = storeUnitsOnHand;
		
	}
public void setPrice( double storePrice ){
	
	price = storePrice;
}
	//accessors
	public String getDescription(){
		
		return description;
	}
	
public int getUnitsOnHand(){
		
		return unitsOnHand;
	}
public double getPrice(){
	
	return price;
}
	

	//constuctor
	public RetailItem(String descriptionSet, int unitsOnHandSet, double priceSet){
	description = descriptionSet;
	unitsOnHand = unitsOnHandSet;
	price = priceSet;
	

}



}