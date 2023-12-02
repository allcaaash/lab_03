package lr3;

import java.util.Scanner;
import java.lang.Math;

public class example19_09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dimension of the array: ");
        int dimension = in.nextInt();

        int[] array = new int[dimension];
        int minValue = 0;

        for (int i = 0; i < array.length; i++){

            array[i] = (int) (Math.random() * 100);

            if (i == 0){
                minValue = array[i];
                continue;
            }

            if (minValue > array[i]){
                minValue = array[i];
            }
        }

        for (int j = 0; j < array.length; j++){

            if (minValue == array[j]){
                System.out.printf("array [%s] = %s, ", j, array[j]);
            }
        }

        in.close();
    }
}
