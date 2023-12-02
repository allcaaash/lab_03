package lr3;

public class example19_08 {
    public static void main(String[] args) {

        char symbol = 'A';
        char[] array = new char[10];

        for (int i = 0; i < array.length; i++){

            if(symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U'){

                symbol += 1;
            }
            array[i] = symbol;
            symbol++;
        }

        for (int j = 0; j < array.length; j++){

            System.out.printf("%s ", array[j]);
            if (j == array.length - 1){
                System.out.print("\n");
            }
        }
    }
}
