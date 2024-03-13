import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        {
            String firstName="";
            String lastName="";

            firstName = SafeInput.getNonZeroLenString(scanner, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(scanner, "Enter you last name");


        }




    }
}
