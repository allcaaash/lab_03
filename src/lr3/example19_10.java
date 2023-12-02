package lr3;

import java.util.Scanner;

public class example19_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dimension of the array: ");
        int dimension = in.nextInt();

        int[] array = new int[dimension];

        for(int i = 0; i < array.length; i++){

            array[i] = (int) (Math.random() * 100);
        }

        //sort by bubble
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        in.close();
    }
}
