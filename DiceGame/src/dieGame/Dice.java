package dieGame;
public class Dice {
public static void main (String[] args){
	
	Die playerDie = new Die(6);
	Die computerDie = new Die(6);
	
	int playerWin = 0;
	int computerWin = 0;
	int ties = 0;
	
	for(int x = 1; x <= 10; x++){
		playerDie.roll();
		computerDie.roll();
		if(playerDie.getDieValue() > computerDie.getDieValue()){
			
			playerWin += 1;
			System.out.println("Player Win!!!");

		}else if(computerDie.getDieValue() > playerDie.getDieValue()){
			computerWin += 1;
		System.out.println("Computer Win!!!");

		}else {
			System.out.println("Tie!!!");

			ties++;
		}
}

if(playerWin > computerWin){
	
	System.out.println("Comgratulations Player Your are the Winner!!!");
	
	
}else if(computerWin > playerWin) {
	
	System.out.println("Comgratulations Computer You are the Winner!!!");

	
}

	
} 
}




