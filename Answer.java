// the Answer class, generates a new random 3 digit answer with distinct digits, also gets the user's guess and tells you how many green and red balls there are
public class Answer {

  private int[] answer = new int[3];
  private int redBall; //18
  private int greenBall;

  //19, constructor that generates a new answer and checks to see that all the digits are distinct
  public Answer(){
    int i = 0;
    boolean duplicate = false; //1c
    //13
    while ((i < 3) || (duplicate == true)){
      int temp = (int)(Math.random() * 10); //9
      //17
      for (int j = i; j > 0; j --){
        if (answer[j-1] == temp){
          duplicate = true;
          j = 0;
        }
        else{
          duplicate = false;
        }
      }
      if (duplicate == false){
        answer[i] = temp;
        i++;
      }
    }
  }
  //4
  // takes in the user-inputted guess as an array, checks with the answer array to see how many green balls there are
  public int numGreenBall(int[] array){
    greenBall = 0;
    int[] guess = array;
    for (int i = 0; i < 3; i++){
      if (answer[i] == guess[i]){
        greenBall += 1;
      }
    }
    return greenBall; //5
  } 
  
  // takes in the user-inputted guess as an array, checks with the answer array to see how many red balls there are
  public int numRedBall(int[] array){
    redBall = 0;
    int match = 0;
    int[] guess = array;
    for (int i = 0; i < 3; i++){
      int temp = guess[i];
      for (int j = 0; j < 3; j++){
        if (temp == answer[j]){
          match += 1;
        }
      }
    }
    redBall = match - greenBall;  
    return redBall;
  }
  
  //3
  // prints the answer array
  public void printAnswer(){
    //23
    for (int digit: answer){
      System.out.print(digit);
    }
    System.out.println();
  }
  
}
