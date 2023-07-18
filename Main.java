import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("This is a simple password generator. There are 6 options to choose from here. Would you like a password consisting of: \n1. Upper and lowercase letters, numbers and characters (such as '!?*%). \n2. Upper and lower case letters and numbers. \n3. Upper case letters. \n4. Lower case letters. \n5. Numbers. \n6. Upper case letters and numbers. Please enter a number from 1-6 to indicate your preference.");
        System.out.print("Please enter a number between 1 and 6: ");
        int number1 = scanner.nextInt();

        System.out.print("Now enter a second number to indicate the length of the password: ");
        int number2 = scanner.nextInt();
        String password;
        if (number1 == 1) {
            password = Generator.generate1(number2);
        } else if (number1 == 2) {
            password = Generator.generate2(number2);
        } else if (number1 == 3) {
            password = Generator.generate3(number2);
        } else if (number1 == 4) {
            password = Generator.generate4(number2);
        } else if (number1 == 5) {
            password = Generator.generate5(number2);
        } else if (number1 == 6) {
            password = Generator.generate6(number2);
        } else {
            System.out.println("You must only enter a digit between 1 and 6, followed by a number specifying size.");
            password = "-1";
        }

        System.out.println("Your generated password is : " + password);
    }
}