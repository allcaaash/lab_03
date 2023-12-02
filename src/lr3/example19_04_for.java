package lr3;

import java.util.Scanner;

public class example19_04_for {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;

        System.out.println("Enter two whole integers: ");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();

        if(firstNum == secondNum){

            System.out.println("The numbers are equal.");

            return;
        }

        if (firstNum > secondNum) {

            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        for (int it = firstNum; it <= secondNum; it++){

            System.out.print(it + " ");
        }

        scanner.close();
    }
}
