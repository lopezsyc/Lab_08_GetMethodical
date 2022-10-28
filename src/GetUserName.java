import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter last name");
        System.out.println("\nFull name is: " + firstName + " " + lastName);
    }
}