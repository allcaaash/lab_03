package lr3;

import java.util.Scanner;

public class example19_03_recursion {

    public static int fibonacciSequence(int value){

        if(value < 2)
            return value;
        else
            return fibonacciSequence(value - 1) + fibonacciSequence(value -2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = 0;

        System.out.println("How many numbers from the Fibonacci sequence to output?");
        value = scanner.nextInt();

        if (value <= 0){
            System.out.println("Error. Incorrect data");
            return;
        }

        for (int i = 0; i < value; i++) {
            System.out.print(fibonacciSequence(i) + " ");
        }

        scanner.close();
    }
}
