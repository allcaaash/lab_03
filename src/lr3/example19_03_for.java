package lr3;

import java.util.Scanner;

public class example19_03_for {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = 0;

        System.out.println("How many numbers from the Fibonacci sequence to output?");
        value = scanner.nextInt();

        if (value <= 0){
            System.out.println("Error. Incorrect data");
            return;
        }

        int iter = 0;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum = 0;

        for (int it = 0; iter < value; iter++){

            if(iter == 0){
                System.out.format("%s ", firstNum);
            }
            else if (iter ==1){
                System.out.format("%s ", secondNum);
            }
            else{
                nextNum = firstNum + secondNum;
                System.out.format("%s ", nextNum);
                firstNum = secondNum;
                secondNum = nextNum;
            }
        }
    }
}
