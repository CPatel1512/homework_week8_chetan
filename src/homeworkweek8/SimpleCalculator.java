package homeworkweek8;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */
public class SimpleCalculator {

    // Fields representing the first and second numbers
    private double firstNumber;
    private double secondNumber;

    // Constructor (optional, not specified in the prompt)
    public SimpleCalculator() {
        // Initialize the numbers to 0
        this.firstNumber = 0.0;
        this.secondNumber = 0.0;
    }

    // Method to get the first number
    public double getFirstNumber() {
        return this.firstNumber;
    }

    // Method to get the second number
    public double getSecondNumber() {
        return this.secondNumber;
    }

    // Method to set the first number
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Method to set the second number
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to calculate the addition result
    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    // Method to calculate the subtraction result
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    // Method to calculate the multiplication result
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    // Method to calculate the division result
    public double getDivisionResult() {
        // Check for division by zero
        if (this.secondNumber == 0) {
            return 0.0; // Return 0 if dividing by zero
        }
        return this.firstNumber / this.secondNumber;
    }

    public static void main(String[] args) {
        // Test the SimpleCalculator class
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult()); // Output: add= 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult()); // Output: subtract= 1.0

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult()); // Output: multiply= 0.0
        System.out.println("divide= " + calculator.getDivisionResult()); // Output: divide= 0.0
    }

}
