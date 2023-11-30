package lr3;

import java.util.Scanner;

public class example19_06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the dimension of the array: ");
        int dimension = in.nextInt();
        if (dimension <= 0 ){

            System.out.print("Error. Incorrect value");
            return;
        }

        int[] array = new int[dimension];
        int num = 0;
        for (int i = 0; i < array.length; i++){

            while(true){

                if (num % 5 == 2){

                    array[i] = num;
                    num++;
                    break;
                }

                num++;
            }
        }

        System.out.println("Array contents:");
        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");
        }
    }
}
