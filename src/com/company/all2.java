package com.company;


    import java.util.Scanner;

    public class all2 {

        public static void prime(Scanner scanner) {
            System.out.print("Enter a positive integer: ");
            try {
                int number = scanner.nextInt();

                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a positive integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void table(Scanner scanner) {
            System.out.println("Enter the number whose table you want to see:");
            int n = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + n * i);
            }
        }

        public static void arithmetic(Scanner scanner) {
            int choice;
            System.out.println("Enter a:");
            int a = scanner.nextInt();
            System.out.println("Enter b:");
            int b = scanner.nextInt();
            do {
                System.out.println(" 1. ADDITION ");
                System.out.println(" 2. SUBTRACTION");
                System.out.println(" 3. MULTIPLICATION");
                System.out.println(" 4. DIVISION");
                System.out.println(" 5. EXIT");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The sum is: " + (a + b));
                        break;
                    case 2:
                        System.out.println("The subtraction is: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Multiplication is: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Division is: " + ((double) a / b));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose again.");
                }
            } while (choice != 5);
        }

        public static void temperature(Scanner scanner) {
            System.out.println("This function will only work in Celsius to Fahrenheit.");
            System.out.print("Enter the temperature in Celsius: ");
            int celsius = scanner.nextInt();
            System.out.println("Temperature in Fahrenheit is: " + ((celsius * 1.8) + 32));
        }

        public static void factorial(Scanner scanner) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }

        public static void evenOdd(Scanner scanner) {
            System.out.print("Enter number to check if it is even or odd: ");
            int numb = scanner.nextInt();
            if (numb % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

        public static void palindrome(Scanner scanner) {
            System.out.print("Enter number to check if it is palindrome or not: ");
            int numb = scanner.nextInt();
            int sum = 0, r;
            int temp = numb;
            while (numb > 0) {
                r = numb % 10;
                sum = (sum * 10) + r;
                numb = numb / 10;
            }
            if (temp == sum) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not palindrome");
            }
        }

        public static void fibonacci(Scanner scanner) {
            int n1 = 0, n2 = 1, n3, count = 10;
            System.out.print(n1 + " " + n2); // Printing 0 and 1

            for (int i = 2; i < count; i++) { // Loop starts from 2 because 0 and 1 are already printed
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println(); // For a new line after the Fibonacci sequence
        }

        public static void main(String[] args) {
            System.out.println("MENU ::: ");
            int choice;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println(" 1. TO CHECK PRIME OR NOT ");
                System.out.println(" 2. TO SEE PATTERNS (Not implemented)");
                System.out.println(" 3. TO PRINT TABLE");
                System.out.println(" 4. TO DO ARITHMETIC FUNCTION.");
                System.out.println(" 5. TO CHECK TEMPERATURE");
                System.out.println(" 6. TO FIND FACTORIAL OF A NUMBER");
                System.out.println(" 7. TO CHECK EVEN OR ODD");
                System.out.println(" 8. TO CHECK PALINDROME");
                System.out.println(" 9. TO SEE FIBONACCI ");
                System.out.println(" 10. !!!EXIT!!! ");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        prime(sc);
                        break;
                    case 2:
                        // Implement pattern function if needed
                        break;
                    case 3:
                        table(sc);
                        break;
                    case 4:
                        arithmetic(sc);
                        break;
                    case 5:
                        temperature(sc);
                        break;
                    case 6:
                        factorial(sc);
                        break;
                    case 7:
                        evenOdd(sc);
                        break;
                    case 8:
                        palindrome(sc);
                        break;
                    case 9:
                        fibonacci(sc);
                        break;
                    case 10:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose again.");
                }
            } while (choice != 10);

            sc.close(); // Close the scanner when done
        }
    }


