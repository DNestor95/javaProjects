package ticketsim;

public class ParkingTicket {
/*–To report the make, model, color, and license number of the illegally parked car
 *  –To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked, 
 *  plus $10 for every additional hour or part of an hour that the car is illegally parked 
 *  –To report the name and badge number of the police officer issuing the ticket
 * */

	
		 
		private ParkedCar vehicle;
		private PoliceOfficer copster;
		private double fine;
		private int minutes;
		private double firstFine = 25;
		private double moreFine = 10;
 
		public ParkingTicket(ParkedCar car, PoliceOfficer cop, double guyFine, int mins) {
 
			vehicle = car;
			copster = cop;
			fine = guyFine;
			minutes = mins;
		}
 
		public void getTotalFine() {
			int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
 
			if(time <= 60) {
				fine = firstFine;
			}
			else {
				fine = firstFine + moreFine * (time / 60);
			}
		}
 
		public double getFirstFine() {
			return firstFine;
		}
		public double getMoreFine() {
			return moreFine;
		}
		public ParkedCar getVehicle() {
			return vehicle;
		}
		public PoliceOfficer getCopster() {
			return copster;
		}
		public int getMinutes() {
			return minutes;
		}
		public double getFine() {
			return fine;
		}
 
 
	}