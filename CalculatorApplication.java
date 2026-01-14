import java.util.Scanner;

public class CalculatorApplication {
        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your first number: ");
            int value1 = scanner.nextInt(); 
            
            System.out.println("Enter your second number");
            int value2 = scanner.nextInt();

            System.out.println("What operation would you like to preform(+, -, *, / ?");
            char operator = scanner.next().charAt(0);

            Calculator TI84 = new Calculator();

            TI84.Calculate(value1, value2, operator);

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