

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // One Scanner for the entire program
    static Scanner scanner = new Scanner(System.in);

    // Starting screen
    static boolean startScreen()
    {
        System.out.println("================================");
        System.out.println("       THE MANDELEEVINATOR!");
        System.out.println("        Element Guessing Game");
        System.out.println("================================");

        String startDecision = "";

        while (!startDecision.equalsIgnoreCase("yes") &&
                !startDecision.equalsIgnoreCase("no"))
        {
            System.out.print("Start? (Yes/No): ");
            startDecision = scanner.nextLine().trim();

            if (!startDecision.equalsIgnoreCase("yes") &&
                    !startDecision.equalsIgnoreCase("no"))
            {
                System.out.println("Invalid response! Please enter Yes or No.");
            }
        }

        if (startDecision.equalsIgnoreCase("yes"))
        {
            System.out.println("\nLet's begin!");
            return true;
        }
        else
        {
            System.out.println("Come back when you're ready!");
            return false;
        }
    }


    // Main guessing game
    static void startGame()
    {
        // Create the element database
        ElementDataBase dataBase = new ElementDataBase();

        // Make a separate list of possible elements
        ArrayList<elements> possibleElements =
                new ArrayList<>(dataBase.getElementDataBase());

        System.out.println("\nThink of an element from the periodic table!");
        System.out.println("I will try to guess your element.");

        // QUESTION 1: State of Matter
        String matterAnswer = "";

        while (!matterAnswer.equalsIgnoreCase("Gas") &&
                !matterAnswer.equalsIgnoreCase("Solid") &&
                !matterAnswer.equalsIgnoreCase("Liquid") &&
                !matterAnswer.equalsIgnoreCase("Unknown"))
        {
            System.out.println("\nWhat is your element's state of matter?");
            System.out.println("Options: Gas, Solid, Liquid, Unknown");

            matterAnswer = scanner.nextLine().trim();

            if (!matterAnswer.equalsIgnoreCase("Gas") &&
                    !matterAnswer.equalsIgnoreCase("Solid") &&
                    !matterAnswer.equalsIgnoreCase("Liquid") &&
                    !matterAnswer.equalsIgnoreCase("Unknown"))
            {
                System.out.println("Invalid answer! Please try again.");
            }
        }

        // Only filter if the player knows the answer
        if (!matterAnswer.equalsIgnoreCase("Unknown"))
        {
            filterByMatter(possibleElements, matterAnswer);
        }

        System.out.println("Remaining possible elements: " +
                possibleElements.size());

        if (possibleElements.isEmpty())
        {
            System.out.println("No elements match those answers!");
            return;
        }


        // QUESTION 2: Element Category
        String groupAnswer = "";

        while (!groupAnswer.equalsIgnoreCase("Metal") &&
                !groupAnswer.equalsIgnoreCase("Nonmetal") &&
                !groupAnswer.equalsIgnoreCase("Metalloid") &&
                !groupAnswer.equalsIgnoreCase("Noble Gas"))
        {
            System.out.println("\nWhat category does your element belong to?");
            System.out.println("Options: Metal, Nonmetal, Metalloid, Noble Gas");

            groupAnswer = scanner.nextLine().trim();

            if (!groupAnswer.equalsIgnoreCase("Metal") &&
                    !groupAnswer.equalsIgnoreCase("Nonmetal") &&
                    !groupAnswer.equalsIgnoreCase("Metalloid") &&
                    !groupAnswer.equalsIgnoreCase("Noble Gas"))
            {
                System.out.println("Invalid answer! Please try again.");
            }
        }

        filterByGroup(possibleElements, groupAnswer);

        System.out.println("Remaining possible elements: " +
                possibleElements.size());

        if (possibleElements.isEmpty())
        {
            System.out.println("No elements match those answers!");
            return;
        }


        // QUESTION 3: Atomic Mass
        String massDecision = "";

        while (!massDecision.equalsIgnoreCase("Yes") &&
                !massDecision.equalsIgnoreCase("No"))
        {
            System.out.println("\nIs your element's atomic mass greater than 50?");
            System.out.println("Options: Yes or No");

            massDecision = scanner.nextLine().trim();

            if (!massDecision.equalsIgnoreCase("Yes") &&
                    !massDecision.equalsIgnoreCase("No"))
            {
                System.out.println("Invalid answer! Please enter Yes or No.");
            }
        }

        if (massDecision.equalsIgnoreCase("Yes"))
        {
            filterByAMass(possibleElements, 50.0, true);
        }
        else
        {
            filterByAMass(possibleElements, 50.0, false);
        }

        System.out.println("Remaining possible elements: " +
                possibleElements.size());

        if (possibleElements.isEmpty())
        {
            System.out.println("No elements match those answers!");
            return;
        }


        // Display the remaining possible elements
        System.out.println("\n======= POSSIBLE ELEMENTS =======");

        for (elements currentElement : possibleElements)
        {
            System.out.println(
                    currentElement.getElementName() + " (" +
                            currentElement.getElementSymbol() + ")"
            );
        }

        System.out.println("\nGuessing complete!");
    }


    // FILTER 1: State of Matter
    static void filterByMatter(
            ArrayList<elements> possibleElements,
            String answer)
    {
        for (int i = possibleElements.size() - 1; i >= 0; i--)
        {
            elements currentElement = possibleElements.get(i);

            if (!currentElement.getMatter().equalsIgnoreCase(answer))
            {
                possibleElements.remove(i);
            }
        }
    }


    // FILTER 2: Element Category
    static void filterByGroup(
            ArrayList<elements> possibleElements,
            String answer)
    {
        for (int i = possibleElements.size() - 1; i >= 0; i--)
        {
            elements currentElement = possibleElements.get(i);

            if (!currentElement.getGroup().equalsIgnoreCase(answer))
            {
                possibleElements.remove(i);
            }
        }
    }


    // FILTER 3: Atomic Mass
    static void filterByAMass(
            ArrayList<elements> possibleElements,
            double answer,
            boolean greaterThan)
    {
        for (int i = possibleElements.size() - 1; i >= 0; i--)
        {
            elements currentElement = possibleElements.get(i);

            double elementMass = currentElement.getAtomicMass();

            if (greaterThan && elementMass <= answer)
            {
                possibleElements.remove(i);
            }
            else if (!greaterThan && elementMass > answer)
            {
                possibleElements.remove(i);
            }
        }
    }


    // Main method
    public static void main(String[] args)
    {
        if (startScreen())
        {
            startGame();
        }
    }
}
