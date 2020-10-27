import operations.DateCalculator;
import operations.IntegerCalculator;
import operations.StringOperations;
import telran.view.ConsoleInputOutput;
import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsoleAppl {
    private static InputOutput io = new ConsoleInputOutput();
    static Item exit = Item.exit();
    static Item calculator = Item.of("Calculator", ConsoleAppl::calculator);
    static Item dateOperations = Item.of("Date operations", ConsoleAppl::dateOperations);
    static Item stringOperations = Item.of("String operations", ConsoleAppl::stringOperations);

    static Item menuItems[] = {calculator, dateOperations,stringOperations, exit};
    static Menu mainMenu = new Menu("Main menu", new ArrayList<>(Arrays.asList(menuItems)));

    public static void main(String[] args) {
        mainMenu.perform(io);

    }

    private static void dateOperations(InputOutput inputOutput) {
        Item addDays = Item.of("Add days to any date", DateCalculator::addDaysToDate);
        Item subtractDays = Item.of("Subtract days from any date", DateCalculator::subtractDays);
        Item daysBetween = Item.of("Calculate days between two dates", DateCalculator::daysBetween);
        Item exit = Item.exit();

        Item arrItems[] = {addDays, subtractDays,daysBetween,exit};

        Menu menu = new Menu("Date operations", new ArrayList<>(Arrays.asList(arrItems)));
        menu.perform(io);
    }

    private static void calculator(InputOutput inputOutput) {
        Item add = Item.of("Addition of two numbers", IntegerCalculator::addNumbers);
        Item subtract = Item.of("Subtract of two numbers", IntegerCalculator::subtractNumbers);
        Item multiply = Item.of("Multiply of two numbers", IntegerCalculator::multiplyNumbers);
        Item division = Item.of("Division of two numbers", IntegerCalculator::divisionNumbers);

        Item exit = Item.exit();
        Item arrItems[] = {add, subtract, multiply, division, exit};

        Menu menu = new Menu("Mini calculator", new ArrayList<>(Arrays.asList(arrItems)));

        menu.perform(io);

    }

    private static void stringOperations(InputOutput inputOutput) {
        Item anagram = Item.of("Defining if a string is anagram", StringOperations::isAnagram);
        Item joiningStrings = Item.of("Joining strings", StringOperations::joiningStrings);

        Item exit = Item.exit();
        Item arrItems[] = {anagram,joiningStrings,exit};

        Menu menu = new Menu("String operations", new ArrayList<>(Arrays.asList(arrItems)));
        menu.perform(io);
    }
}












