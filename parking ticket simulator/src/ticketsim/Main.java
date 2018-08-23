package ticketsim;
public class Main {
 
	public static void main(String[] args) {
 
		ParkedCar car = new ParkedCar("Tesla", "model s", "Black", "tbt234", 45);
 
		ParkingMeter meter = new ParkingMeter(20);
 
		PoliceOfficer john = new PoliceOfficer("Daniel Nestor", 1995);
 
		double ticket = PoliceOfficer.search(car, meter);
 
		if(ticket != 0) {
			System.out.println("The fine will be: " + ticket);
		}
		else {
			System.out.println("Car is not doing anything wrong!");
		}
	}
 
}
