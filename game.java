import java.util.Scanner;

public class game {

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Type in an upper bound number");
		
		int b = cin.nextInt(); //user enters a upper bound number
		
		System.out.println("Please enter a number between 1 and your upper bound number."); 
		
		int random = (int)(1 + b*Math.random()); //the equation that generates a random number
		
		boolean won = false; 
		
		
		while(!won) //loop to here if guess is false
		{
			int user = cin.nextInt(); //user enters a guess
			
			if(user < random) //if guess is less than generated number
			{
				System.out.println("Your guess is too low, try again.");
			}
			else if(user > random) //if guess is greater than generated number
			{
				System.out.println("Your guess is too high, try again.");
			}
			else if (user == random) //if guess is equal to generated number
			{
				System.out.println("You guessed right!");
				won = true; //false equals true
			}
			
		}

		cin.close();
	}
	
}


