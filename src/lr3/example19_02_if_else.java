package lr3;

import java.util.Scanner;

public class example19_02_if_else {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = "";

        System.out.print("Enter the day of the week: ");

        dayOfWeek = scanner.nextLine();
        String dayOfWeekUpperCase = dayOfWeek.toUpperCase();

        if (dayOfWeekUpperCase.equals("MONDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"1\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("TUESDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"2\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("WEDNESDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"3\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("THURSDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"4\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("FRIDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"5\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("SATURDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"6\"", dayOfWeek);
        }
        else if (dayOfWeekUpperCase.equals("SUNDAY")){
            System.out.format("The day of the week \"%s\" corresponds to the number \"7\"", dayOfWeek);
        }
        else {
            System.out.println("You have entered an incorrect name of the day of the week");
        }

        scanner.close();
    }
}
