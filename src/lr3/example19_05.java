package lr3;

import java.util.Scanner;

public class example19_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userValue = 0;
        int num = 5;

        System.out.print("Enter the number of numbers: ");
        userValue = scanner.nextInt();

        if (userValue <= 0){

            System.out.println("Error. Incorrect data.");

            return;
        }

        int[] finalNumbers = new int[userValue];

        int it = 0;
        while (it < finalNumbers.length){

            do{

                if (num % 5 == 2 || num % 3 == 1){

                    finalNumbers[it] = num;
                    num++;

                    break;
                }
                else
                    num++;
            }
            while (true);

            it++;
        }

        for (int i = 0; i < finalNumbers.length; i++){

            if (i < finalNumbers.length - 1)
                System.out.print(finalNumbers[i] + "+");
            else
                System.out.print(finalNumbers[i] + "=");

            sum += finalNumbers[i];
        }

        System.out.print(sum);

        scanner.close();
    }
}
