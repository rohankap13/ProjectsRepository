/**
 * This class is responsible for the priority queue/max heap and can add, remove, swap customers, get the size, get the total number of customers, and get the max queue size
 * 
 * @author Rohan Kapoor
 * @version 10/30/2016
 */

public class PriorityQueue {
		//declaration of the heap array and the size of the heap as well as the total customers served
		private int totalCust, heapSize;
		private PriorityCustomer[] heap;
		//Default constructor
	    /**
	     * PriorityQueue Constructor - default constructor that initializes the starting values to null or 0
	     * No parameters or return type
	     */
		public PriorityQueue()
		{
			//initializes all values to null or 0
			totalCust = 0;
			heap = new PriorityCustomer[50];
			heapSize = 0;
		}
		//add method
	    /**  
	     * Adds one customer to the end of the heap and checks if there is any space left in the heap
	     * @param c  a parameter that brings in the value of a customer
	     * Does not return a value because it is void  
	     */
		public void add(PriorityCustomer c)
		{
			//checks if the size of the heap + 1 is greater than the length of the heap to keep it within bounds
			if (heapSize + 1 >= heap.length) 
			{                  
				//Make sure there's room for the new object          
				System.out.println ("The heap is full");          
				return;       
			}
			//increments the size of the heap and the total number of customers 
			heapSize++;
			totalCust++;
			//sets the new customer as the last customer in the array
			heap[heapSize] = c;
			//sets the size of the array to the index value
			int index = heapSize;
			//checks whether the index is greater than 1
			while (index > 1)
			{
				//declaration of a parentIndex which is half the index of the child
				int parentIndex = index/2;
				//checks if the new customers priority is greater than that of its parent
				if (c.getPriority() > heap[parentIndex].getPriority())
				{
					//if the parent is at the top then, it will not be swapped
					if(parentIndex == 1)
					{
						break;
					}
					//sets the parent as the child
					heap[index] = heap[parentIndex];
					//sets the new customer as the parent
					heap[parentIndex] = c;
					//sets the parents index as the new customer index
					index = parentIndex;
				}
				//otherwise the new customer has a lower priority time therefore it doesn't get swapped
				else
				{
					break;
				}
			}
		}
		//remove method
	    /**  
	     * removes the first customer from the front of the queue and if queue is empty then prints an error message
	     * @return returns the customer object reference
	     */
		public PriorityCustomer remove()
		{
			//checks if the heap is empty
			if (heapSize == 0) 
			{     
				//prints error message saying that the heap cannot removed a customer from an empty heap
				System.out.println ("The heap is empty");          
				return null;       
			}
			//sets the first customer as the root
			PriorityCustomer root = heap[1];
			//sets the last element in the heap as the first
			heap[1] = heap[heapSize];
			//decrements the size of the heap
			heapSize--;
			//checks if the size of the heap is now zero
			if (heapSize == 0)
			{
				//if the heap size is zero, then the only value is returned
				return root;
			}
			//sets the index as one
			int index = 1;
			//finds the value of the priority of the first top most element
			int value = heap[1].getPriority();
			//checks if the index is left than half the heapSize to ensure that there is a parent
			while (index <= heapSize/2)
			{
				//sets values for the left and the right child indexes
				int leftIndex = index * 2;
				int rightIndex = leftIndex + 1;
				//sets the left priority from the left index value's priority
				int leftPriority = heap[leftIndex].getPriority ();
				//set as a really small number right now so that we can check later if there is a right value
				int rightPriority = Integer.MIN_VALUE;
				//if the right index isn't null then it obtains the priority of the right index
				if (heap[rightIndex] != null) 
			    {
					//obtains the priority of the right index
					rightPriority = heap [rightIndex].getPriority ();          
				}
				//checks if the left childs' priority is greater than the right childs' priority
				if (leftPriority > rightPriority) 
				{             
					//check parent value with left child value             
					if (leftPriority > value) 
					{                
					 	//swap left child with parent                
					 	swap(leftIndex, index);                               
					 	//update parent index since we swapped it with the left child                
					 	index = leftIndex;                            
					}
					else 
					{                
						//parent is larger, it's in its correct position. BREAK                
						break;             
					}
				}
				//otherwise the right child has a greater priority than the left child
				else
				{
					//check parent value with right child value
					if (rightPriority > value)
					{
						//swap right child with parent  
						swap(rightIndex, index);
						//update parent index since we swapped it with the left child
						index = rightIndex;
					}
					else
					{
						//parent is larger, it's in its correct position. BREAK
						break;
					}
				}
			}
			//return the first value that was removed from the top of the max heap
			return root;
		}
		//swap method
	    /**  
	     * Swaps the values of the parent and its child if the child has a greater priority number
	     * @param index1, index2  2 parameters in which index1 is the child index and index2 is the parent index
	     * Does not return a value because it is void  
	     */
		private void swap(int index1, int index2)
		{
			//checks if the index of the parent is in the first spot and is still currently being serviced
			if (index2 == 1 && heap[index2].getServiceTime() > 0)
			{
				//doesn't change the values
				heap[index1] = heap[index1];
				heap[index2] = heap[index2];
			}
			//otherwise the values are swapped
			else if (index2 != 1)
			{
				//a temporary variable is created in order to store the object as a dummy variable to swap them
				PriorityCustomer temp = heap [index1];
				heap[index1] = heap[index2];
				heap[index2] = temp;
			}
		}
		//getFirst method
	    /**  
	     * retrieves the first customer of the priority queue
	     * @return returns the first customer object reference
	     */
		public PriorityCustomer getFirst()
		{
			// checks if the size of the queue is greater than zero
			if (heapSize > 0)
			{
				//if the size is greater than 0 then it returns the first customer object
				return heap[1];
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
	     * this method returns the size of the max heap at the given iteration
	     * @return returns integer value of the size of the max heap
	     */
		public int getSize()
		{
			//returns the size of the queue at any given moment
			return heapSize;
		}
		//getTotalCustomer method
	    /**  
	     * creates a running total of the number of customers in the max heap in the 60 minutes
	     * @return returns the integer value of the total number of customers
	     */
		public int getTotalCustomers()
		{
			//returns the total amount of customers that were in the queue at any time
			return totalCust;
		}
		//maxQueue method
	    /**  
	     * this method is updated every iteration and the return value is rewritten if the priority queue size increases more than before to obtain the max size of the priority queue at one point
	     * @param maxSize  a parameter that brings in the value of the maxSize from the driver class
	     * @return returns the integer value of the maximum size of the priority queue at any point
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
