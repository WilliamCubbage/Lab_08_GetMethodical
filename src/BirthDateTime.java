import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth", 1950, 2015); //Input birth year
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth", 1, 12); //Input birth month
        int day = inputDay(scanner, month);                                                             //Method at bottom
        int hour = SafeInput.getRangedInt(scanner, "Enter the hour of birth", 0, 24); //Input hour
        int minute = SafeInput.getRangedInt(scanner, "Enter the minute of birth", 0, 59);//Input minute

        System.out.println("Date of birth: " + day + "/" + month + "/" + year);
        System.out.println("Time of birth: " + hour + ":" + minute);
    scanner.close();
    }

    public static int inputDay(Scanner scanner, int month) {
        int day;
        switch (month) {
            case 2: //Feb
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 29);
                break;
            case 4: // April
            case 6: //June
            case 9: //Sept
            case 11: //Nov
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 30);
                break;
            default: //All other months
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 31);
                break;
        }
        return day;
    }
}
