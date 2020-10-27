package operations;

import telran.view.*;


public class IntegerCalculator {

    public static void multiplyNumbers(InputOutput inputOutput) {
        Integer firstNumber = inputOutput.readInteger("Enter first number");
        Integer secondNumber = inputOutput.readInteger("Enter second number");
        inputOutput.writeLn("result = " + (firstNumber * secondNumber));

    }

    public static void divisionNumbers(InputOutput inputOutput) {
        Integer firstNumber = inputOutput.readInteger("Enter first number");
        Integer secondNumber = inputOutput.readInteger("Enter second number");
        inputOutput.writeLn("result = " + (firstNumber * secondNumber));
    }

    public static void subtractNumbers(InputOutput inputOutput) {
        Integer firstNumber = inputOutput.readInteger("Enter first number");
        Integer secondNumber = inputOutput.readInteger("Enter second number");
        inputOutput.writeLn("result = " + (firstNumber - secondNumber));
    }

    public static void addNumbers(InputOutput inputOutput) {
        Integer firstNumber = inputOutput.readInteger("Enter first number");
        Integer secondNumber = inputOutput.readInteger("Enter second number");
        inputOutput.writeLn("result = " + (firstNumber + secondNumber));
    }
}
