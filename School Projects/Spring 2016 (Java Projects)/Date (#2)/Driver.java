
/**
 * The driver class includes the main method and this class has all the outputs for the program. All the Date objecst are created and the methods are accessed to complete certain tasks like
 * adding, subtracting, and getting different date formats. It also calculates the days between two dates. This also has toString, equals, and compareTo methods. And a few other extra methods
 * to show off the functionality of this program
 * 
 * @author Rohan
 * @version 04/20/2016
 */
public class Driver
{
    public static void main (String [] args)
    {
        System.out.println("Take Home Project Test 3 Part 2: Date");
        //declaration and instantiation of dates
        Date date1 = new Date(1,1,2016);
        Date date2 = new Date(5,29,2016);
        Date dateL = new Date("March",6,2016);
        Date date3 = new Date(2,4,2016);
        Date date4 = new Date(2,4,2016);
        Date date5 = new Date(12,29,2016);
        Date date6 = new Date(2,25,2016);
        Date date7 = new Date(2,25,2015);
        Date date8 = new Date(3,2,2016);
        Date date9 = new Date(3,2,2015);
        Date date10 = new Date(1,20,2016);
        Date date11 = new Date(7,22,2000);
        Date date12 = new Date(7,23,2023);
        //toString method is called to combine the month, day, and year to a friendly output that's easy to read
        System.out.println("toString method:");
        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());
        System.out.println("Date 3: " + date3.toString());
        System.out.println("Date 4: " + date4.toString());
        System.out.println("Date 5: " + date5.toString());
        System.out.println("Date 6: " + date6.toString());
        System.out.println("Date 7: " + date7.toString());
        System.out.println("Date 8: " + date8.toString());
        System.out.println("Date 9: " + date9.toString());
        System.out.println("Date 10: " + date10.toString());
        System.out.println("Date 11: " + date11.toString());
        System.out.println("Date 12: " + date12.toString());
        System.out.println("************************************************************");
        //longToString method is called to combine the long month, day, and string to a friendly output that's easy to read
        System.out.println("Long toString: " + dateL.toStringLong());        
        System.out.println("************************************************************");
        //equals method checks if the two date objects are equal and outputs a true or false
        System.out.println("equals method:");
        //checks if the dates are not equal
        System.out.println("Does date 1 equal date 2: " + date1.equals(date2));
        //checks if the dates are equal
        System.out.println("Does date 3 equal date 4: " + date3.equals(date4));        
        System.out.println("************************************************************");
        //compareTo method compares the two dates and outputs 1 if the first date is later, 0 if the dates are equal, and -1 if the second date is later
        System.out.println("compareTo method:");
        //compare to find out that the second date is later
        System.out.print("Compare date 1 and date 2: ");
        //if statement that checks for case 1
        if (date1.compareTo(date2) == 1)
            System.out.println("Date 1 is later");
        //if statement that checks for case -1
        else if (date1.compareTo(date2) == -1)
            System.out.println("Date 2 is later");
        //else it checks for 0
        else
            System.out.println("The dates are the same");
        //compare to find out that the first date is later
        System.out.print("Compare date 2 and date 3: ");
        //if statement that checks for case 1
        if (date2.compareTo(date3) == 1)
            System.out.println("Date 2 is later");
        //if statement that checks for case -1
        else if (date2.compareTo(date3) == -1)
            System.out.println("Date 3 is later");
        else
        //else it checks for 0
            System.out.println("The dates are the same");
        //compare to find out that the dates are equal
        System.out.print("Compare date 3 and date 4: ");
        //if statement that checks for case 1
        if (date3.compareTo(date4) == 1)
            System.out.println("Date 3 is later");
        //if statement that checks for case -1
        else if (date3.compareTo(date4) == -1)
            System.out.println("Date 4 is later");
        else
        //else it checks for 0
            System.out.println("The dates are the same");
        System.out.println("************************************************************");    
        //add method that adds a particular number of days to the date
        System.out.println("add method:");
        //the date changes and it remains in the same month
        System.out.println("Add 5 days to date 1: " + date1.add(5));
        //the date changes and it changes month
        System.out.println("Add 5 days to date 2: " + date2.add(5));
        //the date changes and it changes years
        System.out.println("Add 5 days to date 5: " + date5.add(5));
        //the date changes and accounts for leap year
        System.out.println("Add 5 days to date 6 (with leap year): " + date6.add(5));
        //the date changes and doesn't account for leap year
        System.out.println("Add 5 days to date 7 (without leap year): " + date7.add(5));
        //changes the dates to the original values
        date1 = new Date(1,1,2016);
        date2 = new Date(5,29,2016);
        date5 = new Date(12,29,2016);
        date6 = new Date(2,25,2016);
        date7 = new Date(2,25,2015);
        System.out.println("************************************************************");
        //subtract method that subtracts a particular number of days from the date
        System.out.println("subtract method:");
        //the date changes and it remains in the same month
        System.out.println("Subtract 5 days from date 2: " + date2.subtract(5));
        //the date changes and it changes month
        System.out.println("Subtract 5 days from date 3: " + date3.subtract(5));
        //the date changes and it changes year
        System.out.println("Subtract 5 days from date 1: " + date1.subtract(5));
        //the date changes and accounts for leap year
        System.out.println("Subtract 5 days from date 8 (with leap year): " + date8.subtract(5));
        //the date changes and doesn't account for leap year
        System.out.println("Subtract 5 days from date 9 (without leap year): " + date9.subtract(5));
        //changes the dates to the original values
        date2 = new Date(5,29,2016);
        date3 = new Date(2,4,2016);
        date1 = new Date(1,1,2016);
        date8 = new Date(3,2,2016);
        date9 = new Date(3,2,2015);
        System.out.println("************************************************************");
        //daysBetween method calculates the days between two dates
        System.out.println("daysBetween method:");
        //calculates the days between two dates in the same month
        System.out.println("Days between date 1 and date 10: " + date1.daysBetween(date10) + " days");
        //calculates the days between two dates in different months
        System.out.println("Days between date 2 and date 5: " + date2.daysBetween(date5) + " days");
        //calculates the days between two dates in different months but less than a full year
        System.out.println("Days between date 9 and date 6 (less than one year): " + date9.daysBetween(date6) + " days");
        //calculates the days between two dates in different months but more than a full year
        System.out.println("Days between date 7 and date 8 (more than one year): " + date7.daysBetween(date8) + " days");
        //changes the dates to the original values
        date6 = new Date(2,25,2016);
        date7 = new Date(2,25,2015);
        date8 = new Date(3,2,2016);
        date9 = new Date(3,2,2015);
        //calculates the days between two dates taking leap year into account
        System.out.println("Days between date 6 and date 8 (with leap year) " + date6.daysBetween(date8) + " days");
        //calculates the days between two dates without taking leap year into account        
        System.out.println("Days between date 7 and date 9 (without leap year): " + date7.daysBetween(date9) + " days");
        //changes the dates to the original values
        date6 = new Date(2,25,2016);
        date7 = new Date(2,25,2015);
        date8 = new Date(3,2,2016);
        date9 = new Date(3,2,2015);
        System.out.println("************************************************************");
        //getDate method outputs the short and long format of the date
        System.out.println("getDate method:");
        //outputs the long format of the date
        System.out.println("Get the long date of date 1: " + date1.getDate('l'));
        //outputs the short format of the date
        System.out.println("Get the short date of date L: " + dateL.getDate('s'));
        System.out.println("************************************************************");
        //zodiac method outputs the zodiac sign for the particular date based on the range of dates that this date falls in
        System.out.println("zodiac method:");
        //outputs four different zodiac signs for the different dates
        System.out.println("Zodiac sign of date 1: " + date1.zodiacSign());
        System.out.println("Zodiac sign of date 2: " + date2.zodiacSign());
        System.out.println("Zodiac sign of date 3: " + date3.zodiacSign());
        System.out.println("Zodiac sign of date 5: " + date5.zodiacSign());
        System.out.println("Zodiac sign of date 8: " + date8.zodiacSign());
        System.out.println("************************************************************");
        //chineseAnimal method outputs the chinese animal for the particular date based on the year that the date falls in
        System.out.println("chineseAnimal method:");
        //outputs four different chinese animals for the different dates
        System.out.println("Chinese Animal of date 1: " + date1.chineseAnimal());
        System.out.println("Chinese Animal of date 7: " + date7.chineseAnimal());
        System.out.println("Chinese Animal of date 11: " + date11.chineseAnimal());
        System.out.println("Chinese Animal of date 12: " + date12.chineseAnimal());
        System.out.println("************************************************************");
        //dayOfYear method outputs the day of the year out of 365 or 366 depending on if the year is a leap year
        System.out.println("dayOfYear method:");
        System.out.println("Day of year of date 1: " + date1.dayOfYear());
        //checks for leap year
        System.out.println("Day of year of date 2: " + date2.dayOfYear());
        System.out.println("Day of year of date 5: " + date5.dayOfYear());
        //doesn't check for leap year
        System.out.println("Day of year of date 12: " + date12.dayOfYear());
        System.out.println("************************************************************");
        //DaysLeftOfYear method outputs the number of days left in the year out of 365 or 366 depending on if the year is a leap year
        System.out.println("daysLeftOfYear method:");
        System.out.println("Days left of year of date 1: " + date1.daysLeftOfYear());
        //checks for leapyear
        System.out.println("Days left of year of date 2: " + date2.daysLeftOfYear());
        System.out.println("Days left of year of date 5: " + date5.daysLeftOfYear());
        //doesn't check for leap year
        System.out.println("Days left of year of date 12: " + date12.daysLeftOfYear());
        System.out.println("************************************************************");
        System.out.println();
    }
}
