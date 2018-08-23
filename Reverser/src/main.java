import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String input;

System.out.println("Enter a String: ");
input = scan.nextLine();

reverse(input);
	}

	private static void reverse(String rev){
		System.out.println("This is your String Backwards: ");
		for (int i=0; i < rev.length(); i++)
			System.out.print(rev.charAt(rev.length() - 1 - i));
		System.out.println();
		
		
	}
	
}
