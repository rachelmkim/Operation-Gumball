import java.util.*;

// takes in the user inputted guess, puts in in an array that keeps track of all the guesses so far
public class Guess {
  
  private int numOfGuess;
  private int[] guess = new int[3];
  private Integer[] allGuesses = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //8 

  public Guess() {} 
  
  // converts the user-inputted guess, which is initially taken as a string, into an integer and adds this integer to the array that keeps track of all the guesses
  public void set (String stringGuess) {
	int intGuess = Integer.parseInt(stringGuess); // only for numeric string
    for (int i = 0; i < 3; i++) {
      guess[i] = Integer.parseInt(stringGuess.substring(i, i+1));
    }
    allGuesses[numOfGuess] = intGuess;
    numOfGuess += 1;
  }

//25, insertion sort, sorts the guesses in the allGuesses array from smallest to largest number
  public void sortAllGuesses() {
    int n = allGuesses.length;  
    for (int j = 1; j < n; j++) {  
      Integer key = allGuesses[j];  
      int i = j-1;  
      while ((i > -1) && (allGuesses[i] > key)) {  
        Integer temp = allGuesses[i];
        allGuesses[i+1] = temp;  
        i--;  
      }  
      allGuesses[i+1] = key; 
    }
  }
  
  //20, accessor method to be used in Main
  public int[] getGuess() {
    return guess;
  }

  // accessor method to be used in Main
  public int getNumOfGuess() {
    return numOfGuess;
  }

  // converts the allGuesses array into an ArrayList, prints the numbers that the user has already guessed
  public void printGuessList() {
    List <Integer> guessList = Arrays.asList(allGuesses);
    if (numOfGuess != 0) {
	    System.out.print("Numbers you have already guessed: ");
	    for (int i = guessList.size() - numOfGuess; i < 10; i++){
	        System.out.print(guessList.get(i) + ", "); //24
	    }
	    System.out.println();
	}
  }
}
