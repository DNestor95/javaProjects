package dieGame;
import java.util.Random;
public class Die {
private int numberOfSides;
private int dieValue;

public void roll(){
	Random random = new Random();
	dieValue = random.nextInt(numberOfSides) + 1;
	
}

public int getDieValue(){
	
	
	return dieValue;
	
}

public Die (int numberOfSidesGiven){
	
	numberOfSides = numberOfSidesGiven;
	roll();
	
}
}
