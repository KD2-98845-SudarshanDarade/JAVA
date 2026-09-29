
import java.util.Scanner;

// User-defined exception
class ExceptionLineTooLong extends Exception {

    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class StringLengthCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        try {
            if (str.length() > 80) {
                throw new ExceptionLineTooLong("The strings is too long");
            }

            System.out.println("Length of string = " + str.length());
        }
        catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
