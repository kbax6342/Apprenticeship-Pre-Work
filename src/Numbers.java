import java.util.Scanner;


public class Numbers {

	public static void main( String[] args) {
		
		int number; 
		int reverse = 0;
		 // setting up the variable  for the the number
		// making a variable for the reverse number
		
	      System.out.println("Welcome to the Number Game!\n"+
	    		  "Please enter the number: ");
	      // This is the prompt to enter a number in the system
	      
	      Scanner in = new Scanner(System.in);
	      // I had to import the scanner system into the class
	      // The scanner reads the data and returns it to the class
	      
	      number = in.nextInt();
	      // This method returns the int scanned from the input
	      
	      while( number != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + number%10;
	          number = number/10;
	      }
	      // This is the code use to reverse the number
	      
	 
	      System.out.println("Reverse of entered number is "+reverse);
	      // This outputs the reverse number to the console
	   }
	
		// TODO Auto-generated method stub

	}

	


