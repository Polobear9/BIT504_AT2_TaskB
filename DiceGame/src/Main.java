import java.util.Scanner;

import java.util.Random;

public class sample {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in); // or (it can be sc)
            Random random = new Random(); // also it can be (ran)
            //populates a random number
            int total = 0;
            int randomNumber = 0;
            
            System.out.print("Enter the number of dice your rolling: "); //asks input for how many dice to use
            int numberOfDice = scanner.nextInt();


            System.out.print("Hey Player! You rolled: "); //displays the random number between 1-6

            for (int i = 0; i < numberOfDice; i++) {

                randomNumber = random.nextInt(6) + 1;
                total += randomNumber;
                System.out.print(randomNumber);
                System.out.print(" ");
            }

            System.out.println("");
            System.out.println("Total amount on dice: " + total); //adds the total number of randomizes number from dice
            System.out.println("Thanks for playing"); //ends game
            scanner.close();

        }//end of program
    }
