package ticketsim;

public class ParkingMeter {
/*know the number of minutes of time purchased*/ 

		 
		private static int minPurchased;
	 
		public ParkingMeter() {
	 
		}
	 
		public ParkingMeter(int carMinPurchased) {
	 
			minPurchased = carMinPurchased;
		}
	 
		public static int getMinPurchased() {
			return minPurchased;
		}
	 
		public String toString() {
			String string = "Minutes Purchased: " + minPurchased;
			return string;
		}
	}