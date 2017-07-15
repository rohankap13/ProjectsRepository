/**
 * This class is responsible for the linked list queue and can add, remove, get the first customer, get the size, get the total number of customers, and get the max queue size
 * 
 * @author Rohan Kapoor
 * @version 09/29/2016
 */
public class LinkedListQueue 
{
	//declaration of the first and last customer objects and the size of the queue as well as the total customers served
	private Customer first, last;
	private int size, totalCust;
	//Default constructor
    /**
     * LinkedListQueue Constructor - default constructor that initializes the starting values to null or 0
     * No parameters or return type
     */
	public LinkedListQueue()
	{
		//initializes all values to null or 0
		first = last = null;
		size = 0;
		totalCust = 0;
	}
	//add method
    /**  
     * Adds one customer to the end of the queue or makes it the first value if the queue is empty
     * @param c  a parameter that brings in the value of a customer
     * Does not return a value because it is void  
     */
	public void add(Customer c)
	{
		//checks to see if the list is empty
		if (first == null)
		{
			//if the list is empty then the new customer added is the first customer 
			first = c;
		}
		//only occurs if the list isn't empty
		else
		{
			//if the list isn't empty then it adds the new customer to the back using the setNext method from the customer class
			last.setNext(c);
		}
		//increases the current size of the queue by 1
		size++;
		//sets the new customer as the last customer
		last = c;
	}
	//remove method
    /**  
     * removes the first customer from the front of the queue and if queue is empty then prints an error message
     * @return returns the customer object reference
     */
	public Customer remove()
	{
		//declaration of a local temporary field
		Customer one = first;
		//checks to see if the list is empty
		if (first == null)
		{
			//prints error message because the method cannot remove an object when the queue is empty
			System.out.println("The line is already empty");
			//returns null as the customer object
			return null;
		}
		//sets the new first as the second customer 
		first = first.getNext();
		//decrements the size of the queue by one because a customer was removed
		size--;
		//increases the total number of customers by 1
		totalCust++;
		//checks to see if the list is empty
		if (first == null)
		{
			//if list is empty then last customer is also a empty field therefore null
			last = null;
		}
		//returns the reference of the temporary field of the customer that got removed
		return one;
	}
	//getFirst method
    /**  
     * retrieves the first customer of the queue (similar to a peek method)
     * @return returns the first customer object reference
     */
	public Customer getFirst()
	{
		// checks if the size of the queue is greater than zero
		if (size > 0)
		{
			//if the size is greater than 0 then it returns the first customer object
			return first;
		}
		//if it fails the first statement and the size is 0 then the queue is empty
		else
		{
			//since the queue is empty it returns null
			return null;
		}
	}
	//getSize method
    /**  
     * this method returns the size of the queue at the given iteration
     * @return returns integer value of the size of the queue
     */
	public int getSize()
	{
		//returns the size of the queue at any given moment
		return size;
	}
	//getTotalCustomer method
    /**  
     * creates a running total of the number of customers in the queue in the 60 minutes
     * @return returns the integer value of the total number of customers
     */
	public int getTotalCustomers()
	{
		//returns the total amount of customers that were in the queue at any time
		return totalCust;
	}
	//maxQueue method
    /**  
     * this method is updated every iteration and the return value is rewritten if the queue size increases more than before to obtain the max size of the queue at one point
     * @param maxSize  a parameter that brings in the value of the maxSize from the driver class
     * @return returns the integer value of the maximum size of the queue at any point
     */
	public int maxQueue(int maxSize)
	{
		//creates a temporary field and is assigned the value of the queue
		int temp = getSize();
		//checks to see if the new temporary value is greater than the current max value of the queue size
		if (temp > maxSize)
		{
			//if the previous statement is true then the temporary field becomes the new max size
			maxSize = temp;
			//returns the max size of the queue
			return maxSize;
		}
		//if the temporary field is not greater than the max size then the program goes through the else statement
		else
		{
			//returns the max size of the queue
			return maxSize;
		}
	}
}