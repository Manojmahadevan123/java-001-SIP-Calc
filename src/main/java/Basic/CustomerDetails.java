import java.util.Scanner;

public class CustomerDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to MEC_BANK!");
        System.out.println("Please enter your details to open an SB account:");

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Email ID: ");
        String emailId = scanner.nextLine();

        System.out.print("Date of Birth (DD/MM/YYYY): ");
        String dateOfBirth = scanner.next();

        System.out.print("Occupation: ");
        String occupation = scanner.nextLine();

        System.out.print("Income: ");
        double income = scanner.nextDouble();

        System.out.print("Initial ");
    }
}