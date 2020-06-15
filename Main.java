import java.util.Scanner;

// the Main class, runs the overall program
public class Main {
  // runs the overall program
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to the game!");
	    int attempts = 0; //1a
	    int green = 0;
	    int red = 0;
		Scanner myObj = new Scanner(System.in);
	    Answer answer = new Answer();
	    Guess userGuess = new Guess();
      //answer.printAnswer(); (this was included for your convenience if you want to see what the answer is when you run the program)
	    while ((attempts < 10) && (green != 3)){
	      userGuess.printGuessList();
	      String stringGuess = getUserInput(myObj); //1d
	      userGuess.set(stringGuess);
	      int[] guess = userGuess.getGuess();
	      green = answer.numGreenBall(guess);
	      System.out.print("Green Balls: " + green);
	      red = answer.numRedBall(guess);
	      System.out.println(" Red Balls: " + red);
	      System.out.println();
	      userGuess.sortAllGuesses();
	      attempts = userGuess.getNumOfGuess();
	    }
	    //10
      if (green == 3){
	      System.out.println("You won!");
	    }
	    if (attempts == 10){
	      System.out.println("You lose! You couldn't guess the number in ten tries.");
	    }
		myObj.close();
	 }
	
  // gets the guess inputted by the user, checks to make sure that the user inputted a 3 digit number
	private static String getUserInput(Scanner scanner) {
		String stringGuess = "";
		//16
    while (true) {
		   System.out.println("Enter a three-digit number guess:");
		   stringGuess = scanner.nextLine(); 
		   if (stringGuess.length() == 3){
		       break;
		   }
		}
		return stringGuess;
	}

}
