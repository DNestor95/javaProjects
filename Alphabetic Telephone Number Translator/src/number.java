
import java.util.Scanner;

import javax.swing.JOptionPane;


public class number {

private static Scanner input;

public static void main(String[] args) {

    input = new Scanner(System.in);
    System.out.println("Enter The Phone Number (With Letters) ");
    String pn = input.nextLine();
    pn = pn.toUpperCase();
    int fpn = 0;

    System.out.printf("The phone number for %s is %s", pn, fpn);

}

public static int full_number(String pn) 
{
    int wc = 0;
    int fpn = 0;
    char ch = (Character) null;

    for (wc = 0; wc < pn.length(); wc++) 
    {
       
    if (Character.isLetter(ch)) 
        {
         switch(ch)
          {
   case 'A' : case 'B' : case 'C' : fpn = 2; break;
   case 'D' : case 'E' : case 'F' : fpn = 3; break;
   case 'G' : case 'H' : case 'I' : fpn = 4; break;
   case 'J' : case 'K' : case 'L' : fpn = 5; break;
   case 'M' : case 'N' : case 'O' : fpn = 6; break;
   case 'P' : case 'Q' : case 'R' : case 'S' : fpn = 7; break;
   case 'T' : case 'U' : case 'V' : fpn = 8; break;
   case 'W' : case 'X' : case 'Y' : case 'Z' : fpn =9; break;
            }
       return (char)fpn;
        }
     if (Character.isDigit(ch))
        {
            return (char)fpn;
        }

        else {
            return (char)fpn;
        }

    } 
    return ch;
}
}