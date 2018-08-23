package ticketsim;

public class PoliceOfficer {
/*
 * –To know the police officer’s name and badge number 
 * –To examine a ParkedCar object and a ParkingMeter object, 
 * and determine whether the car’s time has expired 
 * –To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired
 * */
	
		 
		private String name;
		private int badge;
		private static double ticket;
	 
		public PoliceOfficer() {
	 
		}
	 
		public PoliceOfficer(String poName, int poBadge) {
	 
			name = poName;
			badge = poBadge;
		}
	 
		public String getName() {
			return name;
		}
		public int getBadge() {
			return badge;
		}
	 
		static double search(ParkedCar car, ParkingMeter meter) {
	 
			int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
	 
			if(ParkedCar.getMinutes() > ParkingMeter.getMinPurchased()) {
				if(time <= 60) {
					ticket = 25;
	 
				}
	 
			else {
				ticket = 25 + (10 * (time/60));
			}
			}
			return ticket;
	 
		}
	 
	}
	

