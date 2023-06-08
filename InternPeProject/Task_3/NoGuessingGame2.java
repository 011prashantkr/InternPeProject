package Task_3;
import java.util.Random;
import java.util.Scanner;


public class NoGuessingGame2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String play="yes";
        //while loops
        while (play.equals("yes")){
            Random rand =new Random();
            int randNum = rand.nextInt(100);
            int guess=-1;
            int trail=0;
            //while
            System.out.println("Guess a no between 1 to 100");
            while(guess!=randNum){
                //System.out.println("Guess a no between 1 to 100");
                guess=scanner.nextInt();
                trail++;


                if(guess == randNum){
                    System.out.println("Congratulation You guess the right no");
                    System.out.println("It took only " +trail +"guess)");
                    System.out.println("Would you like to play again? Yes or No: ");
                    play=scanner.next().toLowerCase();
                    break;
                } else if (guess > randNum) {
                    System.out.println("Guess no is too larger! try again");
                }else{
                    System.out.println("Guess no is too  smaller");
                }

            }

        }

        scanner.close();
    }

}
