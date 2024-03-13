import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String socialNum = SafeInput.getRegExString(scanner, "Enter your SSN using ###-##-#### format: ", "^\\d{3}-\\d{2}-\\d{4}$"); //Input for Social Number

    String mNumber =SafeInput.getRegExString(scanner, "Enter your UC Student M number using M##### format", "^(M|m)\\d{5}$"); //Input for Student Number

    String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice using O, S, V, or Q.", "^[OoSsVvQq]$"); //Input for Menu Choice

    scanner.close();


    }
}