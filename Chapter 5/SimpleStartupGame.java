/* 
Class
SimpleStartup
int[] startupArray
Int numberOfHits
Int numberOfGuesses
String checkHit(int input)
void setLocation(int[] startupArray)

Declaration 7

	• DECLARE an array called startupArray with a predetermined size(in this case 7) 
	• DECLARE  an int variable called numberOfHits set to 0
	• DECLARE  an int variable called numberOfGuesses set to 0
	• DECLARE  a method called setLocation() that randomly choses three adjacent cells as the location for the startup 
	• DECLARE  a method called checkHit() that gets a location from player and returns Hit, Miss or Sink. This method should also put the data in hitArray. This method should loop until all the startup cells have been hit. This method should add one to numberOfGuesses for each guess 

Method

METHOD void setLocation(int[] startupArray)
	GET empty startup array
	CHOOSE one cell that has minimum of two cells to its right at random
	FILL the cell in startupArray[]  and two cells to its right for a total of three cells
END METHOD


METHOD string checkHit(int input)
	LOOP while numberOfHits is less than 3
		GET guess from user inform of int
		ADD 1 to numberOfGuesses            
		IF user's guess was correct 
			ADD 1 to numberOfHits
			IF numberOfHits < 3 
				PRINT hit
				ELSE 
					PRINT kill  
					BREAK LOOP
			ELSE 
				PRINT miss
END METHOD
*/


import java.util.Scanner;

public class SimpleStartupGame{
    

    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup startup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] numbers = {randomNum, randomNum +1, randomNum + 2};
        startup.setLocationCells(numbers);
        boolean isAlive = true;
        while(isAlive == true){
            int guess = helper.getUserInput("enter a number");
            String result = startup.checkYourself(guess);
            numOfGuesses++;
            if (result == "kill"){
                System.out.println("You made " + numOfGuesses + " Guesses");
                isAlive = false;
            }
        }
    }


}
class SimpleStartup{
    private int[] locationCells;
    private int numOfHits;

    public String checkYourself(int guess){
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits ++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";       
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] loc){
        locationCells = loc;
    }
    
}

class GameHelper{
    public int getUserInput(String prompt){
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}