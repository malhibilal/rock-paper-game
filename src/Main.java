import java.io.FilterOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userinput;
        int userWon = 0;
        int computerWon = 0;
        int matchTied = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("please insert a option 1 for rock, 2 for paper, 3 for scissors");
            Scanner scanner = new Scanner(System.in);
            userinput = scanner.nextInt();
            if (userinput == 1) {
                System.out.println("your choice is ROCK");
            } else if (userinput == 2) {
                System.out.println("your choice is PAPER");
            } else if (userinput == 3) {
                System.out.println("your choice is SCISSORS");
            } else {
                System.out.println("Wrong input");
            }
            //Random random = new Random();
            int computerInput = 1 + (int)(Math.random() * ((3 - 1) + 1));
          //  System.out.println(computerInput);
           // int computerInput = random.nextInt(4);
            if (computerInput == 1) {
                System.out.println("Computer choice is ROCK");
            } else if (computerInput == 2) {
                System.out.println("Computer choice is PAPER");
            } else if (computerInput == 3) {
                System.out.println("Computer choice is SCISSORS");
            }

            System.out.println("--------------");
            if (userinput == 1 && computerInput == 1 || userinput == 2 && computerInput == 2 || userinput == 3 && computerInput == 3) {
                System.out.println("match tied");
                matchTied++;
            } else if (userinput == 1 && computerInput == 2 || userinput == 2 && computerInput == 3 || userinput == 3 && computerInput == 1) {
                System.out.println("Computer won");
                computerWon++;
            } else if (userinput == 1 && computerInput == 3 || userinput == 2 && computerInput == 1 || userinput == 3 && computerInput == 2) {
                System.out.println("you won");
                userWon++;
            }

            System.out.println("-----------------");
            System.out.println("you won " + userWon + "  times");
            System.out.println("computer won " + computerWon + " times");
            System.out.println("match tied " + matchTied + "  times");

        }
    }
}



