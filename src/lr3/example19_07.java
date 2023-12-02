package lr3;


public class example19_07 {

    public static void main(String[] args) {

        int value = 10;
        char[] alphabet = new char[value];
        char letter = 'a';

        for (int i = 0; i < value; i++){

            alphabet[i] = letter;
            letter += 2;
        }

        System.out.println("Array in direct order: ");
        for (int i = 0; i < value; i++){

            System.out.print(alphabet[i] + " ");
        }

        System.out.println();

        System.out.println("Array in reverse order: ");
        for (int i = --value; i >= 0; i--){

            System.out.print(alphabet[i] + " ");
        }


    }
}
