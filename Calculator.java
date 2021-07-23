import java.util.Locale;
import java.util.Scanner; // Imports Utility Scanner


public class java_number1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in); // Sets scanner's name as 'myobj'
        while (true) {
            System.out.print("Enter first number >>> "); // Tells user to enter the first number.
            int first_number = myobj.nextInt(); // Makes it an input.

            System.out.print("Enter Second Number >>> "); // Tells user to enter the second number.
            int second_number = myobj.nextInt(); // Makes it an input.

            System.out.print("+ = Addition\n- = Subtraction\n* = Multiplication\n" +
                    "/ = Integer Division\n% = Division with reminder only\n" +
                    "Compare = Compares the 2 numbers\n \n" +
                    "Enter method of calculation >>> "); // Tells user to enter the method od calculation.
            String MOC = myobj.next(); // Makes it an input.
            MOC = MOC.toUpperCase(Locale.ROOT); // Converts MOC input to uppercase.

            if (MOC.equals("+")) {
                int added = (first_number + second_number); // An if statement to add the first and second number.
                System.out.print(added + "\n"); // Prints the Added output.
            } else if (MOC.equals("-")) {
                int subtracted = (first_number - second_number); // An if statement to subtract the first and second number.
                System.out.print(subtracted + "\n"); // Prints the Subtracted output.
            } else if (MOC.equals("*")) {
                int multiplied = (first_number * second_number); // An if statement to multiply the first and second number.
                System.out.print(multiplied + "\n"); // Prints the Multiplied output.
            } else if (MOC.equals("/")) {
                int divided = (first_number / second_number); // An if statement to divide the first and second number.
                System.out.print(divided + "\n"); // Prints the Divided output.
            } else if (MOC.equals("%")) {
                int remind_divided = (first_number % second_number); // An if statement to divide and print the reminder only of the first and second number.
                System.out.print(remind_divided + "\n"); // Prints the Reminder output.
            }
            else if (MOC.equals("COMPARE")){  // Comparing the entered 2 numbers.
                if (first_number > second_number){
                    System.out.print("First number is greater than the second number\n"); // This will print if the first number is greater than the second number.
                }
                else if (first_number < second_number){
                    System.out.print("Second number is greater than the first number\n"); // This will print if the second number is greater than the first number.
                }
                else if (first_number == second_number) {
                    System.out.print("Both the are the same.\n"); // This will print if both the numbers are equal.
                }
                else{
                    System.out.print("Error! Enter a number only\n"); // This will print if the input entered are not numbers.
                }
            }
            else{
                System.out.print("Error! Enter the right Method of calculation.\n"); // This will print if input entered in MOC are from the above
            }
        }    
    }
}
