import java.util.*;

public class GuessingNumberGame
{
	public static void main(String[] args) {
		guessingNumber();
	}
	
	public static void guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random()); // Generate the numbers
        int t = 5,i, guess;                        // Given K trials
 
        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

        for (i = 0; i < t; i++) {                 // Iterate over K Trials
          System.out.print("Guess the number: ");
          guess = scan.nextInt();                  // Take input for guessing
          if (number == guess) {                // If the number is guessed
            System.out.println("Congratulations!"+ " You guessed the number.");
            break;
          }
          else if (number > guess && i != t - 1) {  //  If the number is not guessed
            System.out.println("The number is "+ "greater than " + guess);
            }
          else if (number < guess && i != t - 1) {
            System.out.println("The number is"+ " less than " + guess);
            }
        }
 
        if (i == t) {
          System.out.println("You have exhausted "+t+" trials.");
          System.out.println("The number was " + number);
        }
    }
}
