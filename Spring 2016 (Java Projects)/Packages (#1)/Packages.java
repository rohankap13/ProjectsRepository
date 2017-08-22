 
/**
 * Write a description of class Packages here.
 * This class calculates the prices of the packages depending on the hours the user enters and its corresponding payrate.
 * @author Rohan Kapoor
 * @version 02/10/2016
 */
public class Packages
{
    //declaration of variables
    private final double PACKAGE_A = 25.99;
    private final double PACKAGE_B = 35.95;
    private final double PACKAGE_C = 49.00;
    private final double RATE_A = 0.48;
    private final double RATE_B = 0.65;
    private double numOfHours;
    //intializes the number of hours to 0
    public Packages()
    {
        numOfHours = 0;
    }
    /** the setNumOfHours method takes in a number, num, that is obtained by the user and initializes the double variable numOfHours to num.
     * @param num - brought into the method from the driver class which holds the value of how many hours the user uses the internet in a given month.
     * no return type because it is transfering the data over.
     */
    //intializes the numOfHours to the num entered by the user
    public void setNumOfHours (double num)
    {
        numOfHours = num;
    }
    /** the getPackageA method takes in a double, numOfHours, that is obtained by the user and returns a price based on the hours entered.
     * @param numOfHours - brought into the method from the driver class which holds the value of how many hours the user uses the internet in a given month.
     * @return- returns a double value of the monthly bill.
     */
    //if user enters package A, then this get method is called and checks how many hours the user enters and calculates a monthly bill.
    public double getPackageA(double numOfHours)
    {
        double totalBill = 0;
        if (numOfHours < 25)
            totalBill = PACKAGE_A;
        else if (numOfHours < 0)
            totalBill = 0;
        else if (numOfHours > 25)
            totalBill = PACKAGE_A + ((numOfHours - 25) * RATE_A);
        
        return totalBill;     
    }
    /** the getPackageB method takes in a double, numOfHours, that is obtained by the user and returns a price based on the hours entered.
     * @param numOfHours - brought into the method from the driver class which holds the value of how many hours the user uses the internet in a given month.
     * @return- returns a double value of the monthly bill.
     */
    //if user enters package B, then this get method is called and checks how many hours the user enters and calculates a monthly bill.    
    public double getPackageB(double numOfHours)
    {
        double totalBill = 0;
        if (numOfHours < 45)
            totalBill = PACKAGE_B;
        else if (numOfHours < 0)
            totalBill = 0;
        else if (numOfHours > 25)
            totalBill = PACKAGE_B + ((numOfHours - 45) * RATE_B);
            
        return totalBill;
    }
    /** the getPackageC method takes in a double, numOfHours, that is obtained by the user and returns a price based on the hours entered.
     * @param numOfHours - brought into the method from the driver class which holds the value of how many hours the user uses the internet in a given month.
     * @return- returns a double value of the monthly bill.
     */
    //if user enters package C, then this get method is called and checks how many hours the user enters and calculates a monthly bill.    
    public double getPackageC(double numOfHours)
    {
        double totalBill = 0;
        totalBill = PACKAGE_C;
        
        return totalBill;
    }
}
