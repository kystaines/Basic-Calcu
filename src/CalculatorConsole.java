import java.util.Scanner;

public class CalculatorConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");

        while(true) {
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.println("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Basic Calculator!");
                break;
            }

            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean validOperation = true;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                    case 2:
                        result = num1 - num2;
                        break;
                        case 3:
                            result = num1 * num2;
                            break;
                            case 4:
                                if (num2 != 0) {
                                    result = num1 / num2;
                                }else{
                                    System.out.println("You have entered a negative number!");
                                    validOperation = false;
                                }
                                break;
                                default:
                                    System.out.println("You have entered an invalid choice!");
                                    validOperation = false;
            }
            if (validOperation && choice >= 1 && choice <= 4) {
                System.out.println("The result is: " + result);
            }
        }
        sc.close();
    }
}