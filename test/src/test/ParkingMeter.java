package test;

public class ParkingMeter {
	
private int timeLeft = 0;
	
	public boolean add(int a){
	boolean added;
		
		if (a=25){
		timeLeft += 30;
			added = true;
		}else(){
		added = false;
		
		}
	return added;
	}

	public void tick(){
	
		if(timeLeft > 0){
		timeLeft--;
		}
	
	}
	public boolean isExpired() { 
		if(timeLeft = 0){
		return true;
		
		} else {
		return false;
		}
	
	}
}
