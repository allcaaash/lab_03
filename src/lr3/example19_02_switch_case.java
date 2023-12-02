package lr3;

import java.util.Scanner;

public class example19_02_switch_case {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = "";

        System.out.print("Enter the day of the week: ");

        dayOfWeek = scanner.nextLine();
        String dayOfWeekUpperCase = dayOfWeek.toUpperCase();

        switch (dayOfWeekUpperCase){
            case "MONDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"1\"", dayOfWeek);
                break;
            case "TUESDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"2\"", dayOfWeek);
                break;
            case "WEDNESDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"3\"", dayOfWeek);
                break;
            case "THURSDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"4\"", dayOfWeek);
                break;
            case "FRIDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"5\"", dayOfWeek);
                break;
            case "SATURDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"6\"", dayOfWeek);
                break;
            case "SUNDAY":
                System.out.format("The day of the week \"%s\" corresponds to the number \"7\"", dayOfWeek);
                break;
            default:
                System.out.println("You have entered an incorrect name of the day of the week");
                break;
        }

        scanner.close();
    }
}
