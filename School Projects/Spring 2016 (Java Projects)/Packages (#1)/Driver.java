
/**
 * Write a description of class Driver here.
 * This is where the user is shown the menu
 * @author (your name) 
 * @version (a version number or a date)
 */
//imports the scanner class and the other classes too
import java.util.*;
public class Driver
{
    public static void main(String [] args)
    {
        //declaration of the keyboard to read input
        Scanner keyboard = new Scanner(System.in);
        //creates the object and initializes it
        Packages packages;
        packages = new Packages();
        //declaration of the variables
        char option;
        double numOfHours = 0;
        double packA, packB, packC = 0;
        double total, diff = 0;
        //start of the do-while loop
        do
        {
            //this outputs the information about the packages and asks the user for what they would like
            System.out.println("\n\nThere are three possible internet service providers with different prices.");
            System.out.println("Package A is $25.99 per month for 25 hours of internet access. An additional $0.48 is charged per hour over the limit.");
            System.out.println("Package B is $35.95 per month for 45 hours of internet access. An additional $0.65 is charged per hour over the limit.");
            System.out.println("Package C is $49.00 per month for unlimited internet access.");
            System.out.print("Please select a package A, B, or C: (Press Q to quit): ");
            option = keyboard.next().charAt(0);
            if (option == 'A' || option == 'a')
            {
                //asks the user to input the hours they will use internet for
                System.out.print("How many hours will you use? ");
                numOfHours = keyboard.nextDouble();
                //calculates the monthly bill for each package
                total = packages.getPackageA(numOfHours);
                packB = packages.getPackageB(numOfHours);
                packC = packages.getPackageC(numOfHours);
                //outputs package A
                System.out.println("The total monthly price for this package is " + total);
                //calculates discounts if total is less than package B
                if (total < packB)
                {
                    System.out.println("The amount of money you save over package B is $" + (packB - total));
                }
                //calculates discounts if total is less than package C
                if (total < packC)
                {
                    System.out.println("The amount of money you save over package C is $" + (packC - total));
                }
                //alerts the user if the package is not suitable for them
                if (total > packB || total > packC)
                {
                    System.out.println("This is not the best package for you to chose!");
                }
            }
            else if (option == 'B' || option == 'b')
            {
                System.out.println("How many hours will you use?");
                numOfHours = keyboard.nextDouble();
                //calculates the monthly bill for each package
                total = packages.getPackageB(numOfHours);
                packA = packages.getPackageA(numOfHours);
                packC = packages.getPackageC(numOfHours);
                //outputs package B
                System.out.println("The total monthly price for this package is " + total);
                //calculates discounts if total is less than package A
                if (total < packA)
                {
                    System.out.println("The amount of money you save over package A is $" + (packA - total));
                }
                //calculates discounts if total is less than package C
                if (total < packC)
                {
                    System.out.println("The amount of money you save over package C is $" + (packC - total));
                }
                //alerts the user if the package is not suitable for them
                if (total > packA || total > packC)
                {
                    System.out.println("This is not the best package for you to chose!");
                }
            }
            else if (option == 'C' || option == 'c')
            {
                System.out.println("How many hours will you use?");
                numOfHours = keyboard.nextDouble();
                //calculates the monthly bill for each package
                total = packages.getPackageC(numOfHours);
                packA = packages.getPackageA(numOfHours);
                packB = packages.getPackageB(numOfHours);
                //outputs package C
                System.out.println("The total monthly price for this package is " + total);
                //calculates discounts if total is less than package A
                if (total < packA)
                {
                    System.out.println("The amount of money you save over package A is $" + (packA - total));
                }
                //calculates discounts if total is less than package B
                if (total < packB)
                {
                    System.out.println("The amount of money you save over package B is $" + (packB - total));
                }
                //alerts the user if the package is not suitable for them
                if (total > packA || total > packB)
                {
                    System.out.println("This not is the best package for you to chose!");
                }
            }
            //quits the program
            else if (option == 'Q' || option == 'q')
            {
                System.out.println("Thank you and have a nice day");
                System.exit(0); 
            }
            
     }while (option != 'A' || option != 'a'|| option != 'B'|| option != 'b'|| option != 'C'|| option != 'c'|| option != 'Q'|| option != 'q');
}
}
