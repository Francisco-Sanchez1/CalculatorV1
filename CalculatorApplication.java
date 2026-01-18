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
        //Ask for input 1 and 2 then calculate
        //While loop here that loops until "Exit or exit is typed"
        //Edge cases are invalid operator and 0 for the 2nd value
        Boolean calcButton = true;
        Scanner scanner = new Scanner(System.in);

        while (calcButton == true) {

                        
        System.out.println("Enter your first number: ");
        int value1 = scanner.nextInt(); 
        
        System.out.println("Enter your second number");
        int value2 = scanner.nextInt();

        System.out.println("What operation would you like to preform(+, -, *, / ?");
        char operator = scanner.next().charAt(0);
        //alright it seems like doing checker in calculate is difficult to restart loop
        //Going to try to do checker before calculation then the inputs will be clean 
        //CleanData Method basically checks i
        
        if (divisionChecker(value2) == false)
        {
            calcButton = askToExit(scanner);
        }
        else {
            Calculate(value1,value2,operator);
            calcButton = askToExit(scanner);
        }

        
        //asker(Method)

        }
        scanner.close();
    }

    //Calculate Method does the arithmatic 
    public void Calculate(int value1, int value2, char operation) {
        
        switch (operation) {
            case '+' : System.out.print(value1 + value2 + "\n");
                break;
            case '-' : System.out.print(value1 - value2 + "\n");
                break;
            case '*' : System.out.print(value1 * value2 + "\n");
                break;
            case '/' : System.out.print(value1 / value2 + "\n");
                break;
            default:
                System.err.println("That's not a proper operation");
                break;

        }
    
    }

    public boolean calcOnOrOff(String x){
        if (x.contentEquals("Exit") ||x.contentEquals("exit")) {
            return false;
        
        } 
        else {
            return true; 
        }
    }

    public boolean divisionChecker(int y){
        
        if (y == 0){
            System.out.println("Undefined");
            return false;
        } 
        else {
            return true;
        }
    }

    
    //How can I keep the loop going after division by zero?
    //I can ask again would you like to continue? or a asker method
    //If there is divsion error I can say not possible try again or exit?
    //If it's a normal and finished the operatio can just ask to continue or exit
    //What will I need a public method tht return most likley a boolean value and if 
    //that bool value is false then it will kick out of while loop in the run method

    public boolean askToExit (Scanner scanner) {
        
        boolean ans;
        System.out.println("Would you like to continue?"); //get data
        String calcOnorOffAns = scanner.next(); // assign it to a var
        
        //IF specific answer exit then return ans to false
        //Then once true or false is returned it can be assigned to calcButton.

        if (calcOnorOffAns.contentEquals("Exit") || calcOnorOffAns.contentEquals("exit"))
        {
            return false;
        }
        else{
            return true;
        }
        

        
    
    }
    
}