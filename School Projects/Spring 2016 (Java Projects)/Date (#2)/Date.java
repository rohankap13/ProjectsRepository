
/**
 * The Date class is a compilation of all the mothods that have functions with dates. This class can add or subract dates with a given number of days. This class can convert a short date into a 
 * long date or vise versa by changing the month type. This class can calculate the days between two dates. This class can figure out what the zodiac sign is, the chinese animal for the date, 
 * the days passed in a year, and the days left in the year.
 * 
 * @author Rohan Kapoor
 * @version 4/20/2016
 */
public class Date
{
    //declaration of the fields with private access
    private int month;
    private int day;
    private int year;
    private String longMonth;
    /**
     * Date Constructor - default constructor that initializes the starting values
     * No parameters or return type
     */
    public Date()
    {
        //initializes the values of the fields; int is initialized to 0 and string is initialized to null
        month = 0;
        day = 0;
        year = 0;
        longMonth = null;
    }
    /**
     * Date Constructor - overloaded constructor for objects of the class that initializes values that is brought in from the driver class for short dates with no return type
     *
     * @param month - A parameter that brings in the value of the month as an integer type
     * @param day - A parameter that brings in the value of the day as an integer type
     * @param year - A parameter that brings in the value of the year as an integer type
     */
    public Date(int month, int day, int year)
    {
        //initializes the fields of the dates with the short format to the fields of this class
        this.month = month;
        this.day = day;
        this.year = year;
    }
    /**
     * Date Constructor - overloaded constructor for objects of the class that initializes values that is brought in from the driver class for long dates with no return type
     *
     * @param longMonth - A parameter that brings in the value of the month as an string type
     * @param day A parameter that brings in the value of the month as an day type
     * @param year A parameter that brings in the value of the month as an year type
     */
    public Date(String longMonth, int day, int year)
    {
        //initializes the fields of the dates with the long format to the fields of the class
        this.longMonth = longMonth;
        this.day = day;
        this.year = year;
    }
    /**
     * Date Constructor - a copy constructor that copies the data of one date object to another with no return type
     *
     * @param date1 - A parameter that is a date object brought in from the driver class
     */
    public Date(Date date1)
    {
        //this is a copy constructor that initializes the fields of a date to the fields of another date
        this.month = date1.month;
        this.day = date1.day;
        this.year = date1.year;
    }
    /**
     * Method setMonth - sets the value of the short month to the field and doesn't return a value
     *
     * @param monthNum - A parameter brought in from the driver as an integer value of the short month
     */
    public void setMonth (int monthNum)
    {
        //this sets the value of the short month integer value from the main method to the value of the field "month"
        month = monthNum;
    }
    /**
     * Method setDay - sets the value of the day to the field and doesn't return a value
     *
     * @param dayNum - A parameter brought in from the driver as an integer value of the day
     */
    public void setDay (int dayNum)
    {
        //this sets the value of the day integer value from the main method to the value of the field "day"
        day = dayNum;
    }
    /**
     * Method setYear - sets the value of the year to the field and doesn't return a value
     *
     * @param yearNum - A parameter brought in from the driver as an integer value of the day
     */
    public void setYear (int yearNum)
    {
        //this sets the value of the year integer value from the main method to the value of the field "year"
        year = yearNum;
    }
    /**
     * Method setlongMonth - sets the value of the long month to the field and doesn't return a value
     *
     * @param monthNum - A parameter brought in from the driver as an integer value of the long month
     */
    public void setMonth (String month)
    {
        //this sets the value of the long month integer value from the main method to the value of the field "longMonth"
        longMonth = month;
    }
    /**
     * Method getMonth - returns the value of the short month when this method is called upon with no parameters
     *
     * @return - The return value is a integer value of the short month
     */
    public int getMonth()
    {
        //when this method is called, the short month is returned
        return month;
    }
    /**
     * Method getDay - returns the value of the day when this method is called upon with no parameters
     *
     * @return - The return value is a integer value of the day
     */
    public int getDay()
    {
        //when this method is called, the day is returned
        return day;
    }
    /**
     * Method getYear - returns the value of the year when this method is called upon with no parameters
     *
     * @return - The return value is a integer value of the year
     */
    public int getYear()
    {
        //when this method is called, the year is returned
        return year;
    }
    /**
     * Method getlongMonth - returns the value of the long month when this method is called upon with no parameters
     *
     * @return - The return value is a integer value of the long month
     */
    public String getLongMonth()
    {
        //when this method is called, the long month is returned
        return longMonth;
    }
    /**
     * Method toString - this method combines the month, day, and string of a particular date object
     *
     * @return - The return value is a string value of the date with month, day, and year and each field is seperated by slashes.
     */
    public String toString()
    {
        //concatenates the short date string with slash marks
        return month + "/" + day + "/" + year;
    }
    /**
     * Method toStringLong - this method combines the month, day, and string of a particular date object
     *
     * @return - The return value is a string value of the date with month, day, and year and each field is seperated by commas.
     */
    public String toStringLong()
    {
        //concatenates the long date string with commas
        return longMonth + " " + day + ", " + year;
    }
    /**
     * Method equals - this method checks if two dates are the exact same values
     *
     * @param date1 - A parameter brought in from the driver class which has a Date object type
     * @return - The return value of this method is a boolean in which true is that the dates are equal and false is that they are not equal
     */
    public boolean equals (Date date1)
    {
        //this if statement checks if the two Date objects have the exact same values
        if (this.month == date1.month && this.day == date1.day && this.year == date1.year)
        {
            //if the values are the same then it returns true
            return true;
        }
        else
        {
            //otherwise this program returns false
            return false;
        }
    }
    /**
     * Method compareTo - this method compares two dates to see which date is greater or if the dates are the same
     *
     * @param date1 - A parameter that is brought in from the driver class which has a Date object type that is compared with from the initial date
     * @return - The return value is a integer value of 1, 0, or -1; 1 refers to the first date is later, 0 refers to equal dates, and -1 refers to the second date is later
     */
    public int compareTo (Date date1)
    {
        //creates and initializes a local variable that stores the value to be returned
        int num = 0;
        //checks if the first year is greater than the second year
        if (this.year > date1.year)
        {
            //stores a 1 for num because the first date is later than the second date
            num = 1;
        }
        //checks if the second year is greather than the first year
        else if (this.year < date1.year)
        {
            //stores a -1 for num because the second date is later than the first date
            num = -1;
        }
        //checks if the years are the same
        else if (this.year == date1.year)
        {
            //checks if the first month is greater than the second month
            if (this.month > date1.month)
            {
                //stores a 1 for num because the first date is later than the second date
                num = 1;
            }
            //checks if the second month is greather than the first month
            else if (this.month < date1.month)
            {
                //stores a -1 for num because the second date is later than the first date
                num = -1;
            }
            else if (this.month == date1.month)
            {
                //checks if the first day is greater than the second day
                if (this.day > date1.day)
                {
                    //stores a 1 for num because the first date is later than the second date
                    num = 1;
                }
                //checks if the second day is greather than the first day
                else if (this.day < date1.day)
                {
                    //stores a -1 for num because the second date is later than the first date
                    num = -1;
                }
                else
                {
                    //stores a 0 for num because the dates are the same
                    num = 0;
                }
            }
        }
        //returns the value of the num which is then used in the main method with further "if" statements
        return num;
    }
    /**
     * Method add - this method adds the number of days in a month and if the number of days in month is unrealistic, it changes the value of the month and the same process happens to the year if the number of 
     * days is too much. This also checks for leap year
     *
     * @param numDays - A parameter that is a integer value of the number of days that is added to the date which is obtained from the driver class
     * @return - The return value is a Date object that is properly formatted and accounts for every case
     */
    public Date add(int numDays)
    {
        //creates and initializes a local variable that stores the value of the number of days in february
        int febDays;
        //adds the number of days from the parameter to the current day
        this.day += numDays;
        //a do-while loop that runs while the month equals an arbitrary value of 13
        do
        {
            //checks for the leap year
            if (leapYear(this.year))
            {
                //if it is a leap year, then the days in february is 29
                febDays = 29;
            }
            else
            {
                //if it is not a leap year, then the days in february is 28
                febDays = 28;
            }
            //if the month equals the arbitrary value of 13, it is then updated
            if (this.month == 13)
            {
                //value is changed to 1
                this.month = 1;
            }
            if (this.month == 1 && this.day > 31)
            {
                this.month += 1;
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 2 && this.day > febDays)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - febDays;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 3 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 4 && this.day > 30)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 30;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 5 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 6 && this.day > 30)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 30;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 7 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 8 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 9 && this.day > 30)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 30;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 10 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 11 && this.day > 30)
            {
                //increments the month by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 30;
            }
            //if statement checking if this month has more days than possible
            if (this.month == 12 && this.day > 31)
            {
                //increments the month by one if this is the case
                this.year += 1;
                //increments the year by one if this is the case
                this.month += 1;
                //subtracts the days by the number of days of this month
                this.day = this.day - 31;
            }
            //condition that keeps the loop running
        }while (month == 13);
        //returns this date as an object
        return this;
    }
    /**
     * Method subtract - this method subtracts the number of days in a month and if the number of days in month is unrealistic, it changes the value of the month and the same process happens 
     * to the year if the number of days is too little. This also checks for leap year
     *
     * @param numDays - A parameter that is a integer value of the number of days that is subtracted from the date which is obtained from the driver class
     * @return - The return value is a Date object that is properly formatted and accounts for every case
     */
    public Date subtract(int numDays)
    {
        //creates and initializes a local variable that stores the value of the number of days in february
        int febDays;
        //subtracts the number of days from the parameter to the current day
        this.day -= numDays;
        //a do-while loop that runs while the month equals an arbitrary value of 13
        do
        {
            //checks for the leap year
            if (leapYear(this.year))
            {
                //if it is a leap year, then the days in february is 29
                febDays = 29;
            }
            else
            {
                //if it is not a leap year, then the days in february is 28
                febDays = 28;
            }
            //if the month equals the arbitrary value of 0, it is then updated
            if (this.month == 0)
            {
                //value is changed to 1
                this.month = 12;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 12 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 30 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 11 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 10 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 30 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 9 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 8 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 7 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 30 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 6 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 5 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 30 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 4 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 3 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = febDays + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 2 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
            }
            //if statement checking if this month has less days than possible
            if (this.month == 1 && this.day < 1)
            {
                //decrements the month by one if this is the case
                this.month -= 1;
                //adds the days by the number of days of this month
                this.day = 31 + this.day;
                //decrements the year by one if this is the case
                this.year -= 1;
            }
            //condition that keeps the loop running
        }while (month == 0);
        //returns this date as an object
        return this;
    }
    /**
     * Method getDate - this method converts a short date to a long date and also converts a long date to a short date. This also has two methods within this method which do the converting
     *
     * @param format - A character parameter that is obtaned from the main method and the value can only be 'l' or 's' which refers to converting the date to short or long respectively
     * @return - The return value is a string type that returns a string representation of the date in long or short
     */
    public String getDate (char format)
    {
        //creates and initializes a local variable that stores the string representation of the long or short date
        String dateString = "";
        //if statement checking the format of the date to convert to
        if (format == 'l')
        {
            //the string variable returns a statement and this line of code accesses the day and year while also calling another method
            dateString = "The date is: " + longDate(month) + " " + day + ", " + year;
        }
        //if statement checking the format of the date to convert to
        else if (format == 's')
        {
            //the string variable returns a statement and this line of code accesses the day and year while also calling another method
            dateString = "The date is: " + shortDate(longMonth) + "/" + day + "/" + year;
        }
        //returns a textual representation of the date in either long or short format
        return dateString;
    }
    /**
     * Method longDate - this method converts the short month type to the long month type
     *
     * @param numMonth - A parameter that is an integer value of the current month
     * @return - The return value is a string value of the representation of the numerical month
     */
    public String longDate(int numMonth)
    {
        //creates and initializes a local variable that stores the string representation of the long date
        String longMonth = "";
        //if statement that checks the value of the month passed into this method
        if (numMonth == 1)
        {
            //stores a long month string into the variable
            longMonth = "January";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 2)
        {
            //stores a long month string into the variable
            longMonth = "February";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 3)
        {
            //stores a long month string into the variable
            longMonth = "March";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 4)
        {
            //stores a long month string into the variable
            longMonth = "April";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 5)
        {
            //stores a long month string into the variable
            longMonth = "May";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 6)
        {
            //stores a long month string into the variable
            longMonth = "June";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 7)
        {
            //stores a long month string into the variable
            longMonth = "July";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 8)
        {
            //stores a long month string into the variable
            longMonth = "August";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 9)
        {
            //stores a long month string into the variable
            longMonth = "September";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 10)
        {
            //stores a long month string into the variable
            longMonth = "October";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 11)
        {
            //stores a long month string into the variable
            longMonth = "November";
        }
        //if statement that checks the value of the month passed into this method
        else if (numMonth == 12)
        {
            //stores a long month string into the variable
            longMonth = "December";
        }
        //returns the long month
        return longMonth;
    }
    /**
     * Method shortDate - this method converts the long month type to the short month type
     *
     * @param longMonth - A parameter that is a string value of the current month
     * @return - The return value is a integer value of the numerical representation of the long month
     */
    public int shortDate(String longMonth)
    {
        //creates and initializes a local variable that stores the integer value of the short date
        int shortDate = 0;
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        if (longMonth.equals("January"))
        {
            //stores a short month integer value into the variable
            shortDate = 1;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("February"))
        {
            //stores a short month integer value into the variable
            shortDate = 2;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("March"))
        {
            //stores a short month integer value into the variable
            shortDate = 3;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("April"))
        {
            //stores a short month integer value into the variable
            shortDate = 4;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("May"))
        {
            //stores a short month integer value into the variable
            shortDate = 5;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("June"))
        {
            //stores a short month integer value into the variable
            shortDate = 6;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("July"))
        {
            //stores a short month integer value into the variable
            shortDate = 7;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("August"))
        {
            //stores a short month integer value into the variable
            shortDate = 8;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("September"))
        {
            //stores a short month integer value into the variable
            shortDate = 9;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("October"))
        {
            //stores a short month integer value into the variable
            shortDate = 10;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("November"))
        {
            //stores a short month integer value into the variable
            shortDate = 11;
        }
        //if statement that checks the value of the long date passed into this method using the .equals method because it is checking the address
        else if (longMonth.equals("December"))
        {
            //stores a short month integer value into the variable
            shortDate = 12;
        }
        //returns the short month
        return shortDate;
    }
    /**
     * Method leapYear - this method checks if the current year is a leap year which has the case of modulus 4 except modulus 100 except modulus 400
     *
     * @param numYear - A parameter this takes in the value of the year from other methods generally
     * @return - The return value is a boolean type which returns true if the year is a leap year and false if it isn't
     */
    public boolean leapYear(int numYear)
    {
        //creates and initializes a local variable that stores the boolean value of if a year is a leap year
        boolean leap = false;
        //if statement that checks the case if the year modulus 4 and year not modulus 100 are true
        if (numYear % 4 == 0 && numYear % 100 != 0)
        {
            //returns true if the case is true
            leap = true;
        }
        //if statement that checks the case if the year modulus 4 and year modulus 400 are true
        else if (numYear % 4 == 0 && numYear % 400 == 0)
        {
            //returns true if the case is true
            leap = true;
        }
        //else statement if none of the other 2 cases are true
        else
        {
            //returns false because the cases aren't true
            leap = false;
        }
        //returns the boolean value of true or false if it is a leap year
        return leap;
    }
    /**
     * Method daysBetween - this method calculates the days between two dates and this checks every case including same and different months, same and different years, leap years, and the same 
     * date. This also uses two separate private methods and calculates the days within the months in this method
     *
     * @param other - A parameter that takes in another Date object type that the program calculates the days between from
     * @return - The return value is an integer value of the number of days between two specific Date objects and the number is a only positive value
     */
    public int daysBetween(Date other)
    {
        //declaration of a new Date object using a copy constructor that copies all the data from "other" to "another"
        Date another = new Date(other);
        //declaration of local variables and initializing the days to 0
        int days = 0, febDays, daysBetweenYears, daysBetweenMonths;
        //calls another method to get the days between the years with at least a 12 month difference and sets it equal to a local variable
        daysBetweenYears = daysBetweenYears(other);
        //calls another method to get the days between the months between the months and sets it equal to a local variable
        daysBetweenMonths = daysBetweenMonths(another);
        //if statement that checks if the year is a leap year
        if (leapYear(this.year))
        {
            //if the year is a leap year then the days of february is 29
            febDays = 29;
        }
        else
        {
            //if the year is not a leap year then the days of february is 28
            febDays = 28;
        }
        //if statement that checks if the months are equal
        if (this.month == other.month)
        {
            //if the months are the same then it subracts the number of days between the months
            days =+ other.day - this.day;
        }
        //if the months are not the same then a series of if statements are used and checked to see which value falls true
        else
        {
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 1)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 2)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += febDays - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 3)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 4)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 30 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 5)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 6)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 30 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 7)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 8)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 9)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 30 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 10)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 11)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 30 - this.day;
            }
            //if statement that checks if the current month is equal to the integer value
            else if (this.month == 12)
            {
                //adds the number of days to this month to days and subracts the current day of the month
                days += 31 - this.day;
            }
        }
        //returns the integer sum from the two separate methods called and the days from the current month
        return daysBetweenYears + daysBetweenMonths + days;
    }
    /**
     * Method daysBetweenYears - this is a method within the daysBetween method and this calculates the number of days between the two years if they are at least 12 months apart
     *
     * @param other - A parameter that takes in another Date object type that the program calculates the days between the years of this object and the other object
     * @return - The return value is a integer value of the number of days between the two years
     */
    public int daysBetweenYears(Date other)
    {
        //declaration and initialization of a local variable
        int days = 0;
        //a while loop that checks if the years are not the same and the first month is less than the second month to ensure at least a 12 month difference
        while(this.year != other.year && this.month <= other.month)
        {
            //if statement that checks if the current year is a leap year
            if (leapYear(this.year))
            {
                //adds the number of days by 366 if it is a leap year
                days += 366;
            }
            else
            {
                //adds the number of days by 365 if it is a leap year
                days += 365;
            }
            //increments the year by one and then checks the while loop condition again
            this.year += 1;
        }
        //returns the integer value of the number of days between the years
        return days;
    }
    /**
     * Method daysBetweenMonths - this is a method within the daysBetween method and this calculates the number days between the number of months if the months are different
     *
     * @param other - A parameter that takes in another Date object type that the program calculates the days between the months of this object and the other object
     * @return - The return value is a integer value of the number of days between the two months
     */
    public int daysBetweenMonths(Date other)
    {
        //declaration and initialization of local variables        
        int days = 0, febDays;
        //a while loop that checks to make sure the months are not the same
        while(this.month != other.month)
        {
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 1)
            {
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 2)
            {
                //if statement that checks if the year is a leap year
                if (leapYear(this.year))
                {
                    //if the statement is true then the days in February is 29
                    febDays = 29;
                }
                //otherwise the year is not a leap year
                else
                {
                    //otherwise the days in February is 28
                    febDays = 28;
                }
                //adds the days of this month to the number of days
                days += febDays;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 3)
            {
                //adds the days of this month to the number of days
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 4)
            {
                //adds the days of this month to the number of days
                days += 30;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 5)
            {
                //adds the days of this month to the number of days
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 6)
            {
                //adds the days of this month to the number of days
                days += 30;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 7)
            {
                //adds the days of this month to the number of days
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 8)
            {
                //adds the days of this month to the number of days
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 9)
            {
                //adds the days of this month to the number of days
                days += 30;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 10)
            {
                //adds the days of this month to the number of days
                days += 31;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 11)
            {
                //adds the days of this month to the number of days
                days += 30;
            }
            //if statement that checks if the current month is equal to the integer value
            if (this.month == 12)
            {
                //adds the days of this month to the number of days
                days += 31;
                //sets the value of the month to 0 to reset the process
                this.month = 0;
                //increments the year by one
                this.year += 1;
            }
            //increments the month by one and checks the condition for the while loop again
            this.month += 1;
        }
        //returns the integer value of the number of days between the months
        return days;
    }
    /**
     * Method zodiacSign - this method checks which range of dates the Date object falls under. This method calculates the days between the first date of the year and this date and checks to 
     * see which range of days it falls under and which zodiac sign it is
     *
     * @return - The return value is a string representation of the particular zodiac sign
     */
    public String zodiacSign()
    {
        //declaration and initialization of local variables 
        int dayCount;
        String zodiac = "";
        //creates a new object of the first date of the current year
        Date initial = new Date(1,1,this.year);
        //finds the days between the initial date and the current date and adds one
        dayCount = initial.daysBetween(this) + 1;
        //checks if this year is not a leap year
        if (!leapYear(this.year))
        {
            //if statement that checks if the days between the initial and current date fall in this range
            if (dayCount >= 20 && dayCount <= 49)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Aquarius";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 50 && dayCount <= 79)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Pisces";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 80 && dayCount <= 109)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Aries";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 110 && dayCount <= 140)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Taurus";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 141 && dayCount <= 171)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Gemini";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 172 && dayCount <= 203)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Cancer";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 204 && dayCount <= 234)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Leo";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 235 && dayCount <= 265)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Virgo";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 266 && dayCount <= 295)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Libra";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 296 && dayCount <= 325)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Scorpio";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 326 && dayCount <= 355)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Sagittarius";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 356 || dayCount <= 19)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Capricorn";
            }
        }
        //checks if this year is a leap year and accordingly adds the range start and end by one day
        else if (leapYear(this.year))
        {
            //if statement that checks if the days between the initial and current date fall in this range
            if (dayCount >= 20 && dayCount <= 49)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Aquarius";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 50 && dayCount <= 80)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Pisces";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 81 && dayCount <= 110)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Aries";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 111 && dayCount <= 141)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Taurus";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 142 && dayCount <= 172)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Gemini";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 173 && dayCount <= 204)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Cancer";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 205 && dayCount <= 235)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Leo";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 236 && dayCount <= 266)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Virgo";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 267 && dayCount <= 296)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Libra";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 297 && dayCount <= 326)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Scorpio";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 327 && dayCount <= 356)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Sagittarius";
            }
            //if statement that checks if the days between the initial and current date fall in this range
            else if (dayCount >= 357 || dayCount <= 19)
            {
                //sets the string representation of the zodiac sign to the variable
                zodiac = "Capricorn";
            }
        }
        //returns the string representation of the zodiac sign
        return zodiac;
    }
    /**
     * Method chineseAnimal - this method checks to see the year that the chinese animal falls in based around the year 2008 which was year of the rat
     *
     * @return - The return value is a string representation of the chinese animal based on which year it is
     */
    public String chineseAnimal()
    {
        //declaration and initialization of local variables 
        int yearDiff;
        String chineseZodiac = "";
        //if statement that checks if the year is greater than the standard year
        if (this.year >= 2008)
        {
            //subtracts the current year by a standard year value to keep it a positive number
            yearDiff = this.year - 2008;
            {
                //if statement that checks if the modulus operation is equal to the integer value
                if (yearDiff % 12 == 0)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rat";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 1)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Ox";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 2)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Tiger";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 3)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rabbit";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 4)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Dragon";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 5)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Snake";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 6)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Horse";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 7)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Goat";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 8)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Monkey";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 9)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rooster";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 10)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Dog";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 11)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Pig";
                }
            }
        }
        //if statement that checks if the year is less than the standard year
        else if (this.year < 2008)
        {
            //subtracts the standard year value by the current year to keep it a positive number
            yearDiff = 2008 - this.year;
            {
                //if statement that checks if the modulus operation is equal to the integer value
                if (yearDiff % 12 == 0)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rat";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 1)
                {
                    //sets the string representation of the animal sign to the variable
                   chineseZodiac = "Pig";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 2)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Dog";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 3)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rooster";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 4)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Monkey";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 5)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Goat";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 6)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Horse";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 7)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Snake";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 8)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Dragon";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 9)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Rabbit";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 10)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Tiger";
                }
                //if statement that checks if the modulus operation is equal to the integer value
                else if (yearDiff % 12 == 11)
                {
                    //sets the string representation of the animal sign to the variable
                    chineseZodiac = "Ox";
                }
            }
        }
        //returns the string representation of the animal sign
        return chineseZodiac;
    }
    /**
     * Method dayOfYear - this method returns what day of the year it is out of 365 days or 366 days depending on if the year is a leap year
     *
     * @return - The return value is a number between 0 and 365 or 0 and 366 depending on leap year and it is the day of the particular year
     */
    public int dayOfYear()
    {
        //declaration and initialization of local variables 
        int days;
        //creates a new object of the first date of the current year        
        Date initial = new Date(1,1,this.year);
        //calculates the days between the first day of the current year and the current day plus one
        days = initial.daysBetween(this) + 1;
        //returns that integer value of the days between the initial date and the current date
        return days;
    }
    /**
     * Method daysLeftOfYear - this method returns how many days are left in a year out of 365 days or 366 days depending on if the year is a leap year
     *
     * @return The return value number between 0 and 365 or 0 and 366 depending on leap year and it is the number of days left of the particular year
     */
    public int daysLeftOfYear()
    {
        //declaration and initialization of local variables 
        int days;
        //creates a new object of the first date of the current year        
        Date initial = new Date(1,1,this.year);
        //if statement that checks if the year is a leap year
        if (leapYear(this.year))
        {
            //subtracts the leap year amount of days by the days between minus one 
            days = 366 - initial.daysBetween(this) - 1;
        }
        //if statement that checks if the year is not a leap year
        else
        {
            //subtracts the regular year amount of days by the days between minus one
            days = 365 - initial.daysBetween(this) - 1;
        }
        //returns the integer value of days between the current date and the final date
        return days;
    }
}
