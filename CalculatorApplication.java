import java.util.Scanner;
//V1: Basic calculations + - * /
//V2: Continuous Input (loop until exit), Input Validation, Division by zero handaling, Clear error message

public class CalculatorApplication {
        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);
            String appOn = "Run";

            while (appOn == "Run") {
            
            
            System.out.println("Enter your first number: ");
            int value1 = scanner.nextInt(); 
            
            System.out.println("Enter your second number");
            int value2 = scanner.nextInt();

            System.out.println("What operation would you like to preform(+, -, *, / ?");
            char operator = scanner.next().charAt(0);

            Calculator TI84 = new Calculator();
            TI84.Calculate(value1, value2, operator);

            System.out.println("Would you like to exit?");
            appOn = scanner.next();

            }  

            scanner.close();
    }
}

class Calculator {
    int answer;


    public void Calculate(int value1, int value2, char operation) {
        if (operation == '+'){
            answer = value1 + value2;
            System.out.println("Answer: " + answer);
            
        }
        else if (operation == '-') {
            answer = value1 - value2;
            System.out.println("Answer: " + answer);

        }
        else if (operation == '*') {
            answer = value1 * value2;
            System.out.println("Answer: " + answer);
            
        }
        else if (operation == '/') {
            answer = (value1 / value2);
            System.out.println("Answer: " + answer);
        }
        else{
            System.out.println("Not Valid Operation");

        }
    }

}