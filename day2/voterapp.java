
import java.util.Scanner;

public class voterapp{
    public static void main(String[] args) {
        String name ="", pan ="", aadhaar ="",mobile ="", email ="";
        boolean isValid = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Enter your PAN number");
        pan = scan.nextLine();
        System.out.println("Enter your Aadhaar number");
        aadhaar = scan.nextLine();
        System.out.println("Enter your mobile number");
        mobile = scan.nextLine();
        System.out.println("Enter your email");
        email = scan.nextLine();
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name");
            isValid = false;
        }
        if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            System.out.println("Invalid PAN number");
            isValid = false;
        }
        if (!aadhaar.matches("[0-9]{12}")) {
            System.out.println("Invalid Aadhaar number");
            isValid = false;
        }
        if (!mobile.matches("[0-9]{10}")) {
            System.out.println("Invalid mobile number");
            isValid = false;
        }
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("Invalid email");
            isValid = false;
        }
        if (isValid) {
            System.out.println("All details are valid.");
        }
        else {
            System.out.println("Please correct the invalid details.");
        }
    }
}
