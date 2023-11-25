package lr3;

import java.util.Scanner;

public class example19_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        boolean isCorrect = false;

        while(!isCorrect){

            System.out.println("Enter a number from 1 to 7 inclusive: ");
            userNum = scanner.nextInt();

            switch (userNum){
                case 1:
                    System.out.println("Monday");
                    isCorrect = true;
                    break;

                case 2:
                    System.out.println("Tuesday");
                    isCorrect = true;
                    break;

                case 3:
                    System.out.println("Wednesday");
                    isCorrect = true;
                    break;
                case 4:
                    System.out.println("Thursday");
                    isCorrect = true;
                    break;

                case 5:
                    System.out.println("Friday");
                    isCorrect = true;
                    break;

                case 6:
                    System.out.println("Saturday");
                    isCorrect = true;
                    break;

                case 7:
                    System.out.println("Sunday");
                    isCorrect = true;
                    break;

                default:
                    System.out.println("You entered the wrong number. Please, try again.");
                    break;
            }
        }

    }
}
