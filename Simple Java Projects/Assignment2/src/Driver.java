//import the java.util library to use the random function
import java.util.*;
/*
 * The driver class has the main method and this method as all of the output for the program along with the instantiation of the priority queue and customers
 */
public class Driver 
{
	/*
	 * the main method where all of the output occurs
	 */
	public static void main (String [] args)
	{
		//declaration of the max heap, priority customer, and maxSize for the queue
		PriorityQueue heap = new PriorityQueue();
		PriorityCustomer cust = new PriorityCustomer();
		int maxSize = 0;
		//for loop for every minute for 60 minutes
		for (int i = 0; i < 60; i++)
		{
			//declaration of a local field named rand which uses the random function. There is a 25% chance for a new customer to be added
			int rand = new Random().nextInt(4) + 1;
			//used the value of 1 as the one number out of four that adds a new customer
			if (rand == 1)
			{
				//if the rand value equals one, then the priority queue adds a new customer object
				heap.add(new PriorityCustomer());
				//output message that a new customer was added and displays the size of the priority queue
				System.out.println("New customer added! Queue length is now: " + heap.getSize());
				//rewrites the value for the maxSize if the size of the queue is the largest it has been in the whole for loop
				maxSize = heap.maxQueue(maxSize);
			}
			//checks if the priority queue size is greater than 0
			if (heap.getSize() > 0)
			{
				//uses the customer object to get the first customer from the queue
				cust = heap.getFirst();
				//checks if the service time for the customer is 0 which also means the customer is done get serviced
				if (cust.getServiceTime() == 0)
				{
					//if the service time is 0 then the queue removes the first object
					heap.remove();
					//output message saying that the customer was serviced and removed from the priority queue and displays the new size of the priority queue
					System.out.println("Customer serviced and removed from the queue. Queue length is now: " + heap.getSize());
				}
				//checks if the service time is greater than 0
				else if (cust.getServiceTime() > 0)
				{
					//decrements the time of the customer service time by 1
					cust.decServiceTime();
				}
			}
			//output message that clearly shows the end of each minute or iteration of the program
			System.out.println(i + "------------------------------");
		}
		//output message giving the total number of the customers serviced
		System.out.println("The total number of customers serviced was: " + heap.getTotalCustomers());
		//output message giving the max size of the priority queue at any given moment
		System.out.println("The max size of the queue was: " + maxSize);
	}
}