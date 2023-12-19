import java.util.Random;
import java.util.Scanner;

public class NumberGame
 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            int ans = random.nextInt(100) + 1;
            int rounds = 3;
            boolean correct = false;

            System.out.println("**********Wlcome to the number guessing game**********");
            while(rounds>0)
            {
                System.out.println("\nEnter your number from 1 to 100 : ");
                int guess=sc.nextInt();

                if(guess==ans)
                {
                    System.out.println("Congratulations!You guessed the number correctly");
                    break;
                }
                else if(guess<ans)
                {
                    System.out.println("Sorry!The ans you have guessed is low.");
                    System.out.println("You have " + (rounds-1) + " tries left!");
                    rounds--;
                }
                else if(guess>ans)
                {
                    System.out.println("Sorry!The ans you have guessed is high.");
                    System.out.println("You have " + (rounds-1) + " tries left!");
                    rounds--;
                }
            }
                if(correct==false)
                {
                    System.out.println("Sorry!You went out of trials. The correct number is : " +ans);

                }
            } 

        }  
