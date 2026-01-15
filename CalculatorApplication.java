import java.util.Scanner;
//V1: Basic calculations + - * /
//V2: Continuous Input (loop until exit), Input Validation, Division by zero handaling, Clear error message

public class CalculatorApplication {
        public static void main (String [] args){
            // Main should read like a sentence not a complex alg
            // Main should not contain business logic, handle input, calculation + output
            // make a class of Calculator
            // Run the calculator normally


            Calculator TI84 = new Calculator();
            TI84.Run();      


    }
}

class Calculator {
    int finalAnswer;

    //Let's make a run method that get's input's and assigns them to variables to pass into calculate.
    public void Run(){
        //Ask for input 1
        Scanner scanner = new Scanner(System.in);
                        
        System.out.println("Enter your first number: ");
        int value1 = scanner.nextInt(); 
        
        System.out.println("Enter your second number");
        int value2 = scanner.nextInt();

        System.out.println("What operation would you like to preform(+, -, *, / ?");
        char operator = scanner.next().charAt(0);
        
        finalAnswer = Calculate(value1, value2, operator);
        System.out.println(finalAnswer);


        scanner.close();

    }

    //Calculate Method does the arithmatic 
    public int Calculate(int value1, int value2, char operation) {
        int answer;
        if (operation == '+'){
            answer = value1 + value2;            
        }
        else if (operation == '-') {
            answer = value1 - value2;

        }
        else if (operation == '*') {
            answer = value1 * value2;
            
        }
        else{
            return 0;
        }
        return answer;
    }

    public void divisionOperation(int x, int y){
        int ans;
        if (y == 0){
            System.out.println("Undefined");
        }
        else{
            ans = x / y;
            System.out.println("Answer: " + ans);
        }
    }

    }
