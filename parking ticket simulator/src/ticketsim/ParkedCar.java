package ticketsim;

public class ParkedCar {
	/*cars MAKE, MODEL, COLOR, PLATE NUMBER, MINUTES PARKED    */
	
		 
		private String make;
		private String model;
		private String color;
		private String license;
		private static int minutes;
	 
		
	 
		public ParkedCar(String carMake, String carModel, String carColor, String carLicense, int carMinutes) {
	 
			make = carMake;
			model = carModel;
			color = carColor;
			license = carLicense;
			minutes = carMinutes;
		}
	 
		public String getMake() {
			return make;
		}
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public String getLicense() {
			return license;
		}
		public static int getMinutes() {
			return minutes;
		}
	 
		public String toString() {
	 
			String string = "Make: " + make
					+ "\nModel: " + model
					+ "\nColor: " + color
					+ "\nLicense Plate: " + license;
				return string;
	 
		}


}
