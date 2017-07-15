/Users/rohan/Documents/Stuff/College/ITCS 1213/THPT4 Queue/ArrayQueue.java
/**
 * Write a description of class ArrayQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayQueue<T> implements QueueADT<T>
{
    //declaration of variables
    private T [  ] items;
    private int count;
    //Default constructor
    /**
     * Constructor for objects of class ArrayQueue that initializes 
     */
    public ArrayQueue( ) 
    {
        items = (T[ ]) new Object[5];
        count = 0;
    }
    //enqueue method
    /**  
     * Adds one element to the rear of this queue. 
     * @param element  the element to be added to the rear of the queue  
     */
    public void enqueue(T element)
    {
        //condition if count is less than the length
        if(count < items.length)
        {
            //sets the particular element to the variable
            items[count] = element;
            //increments count
            count++;
        }
        //otherwise this statement is called
        else
        {
            //output if no room is available
            System.out.println("No room in the list for the item");
        }
    }
    //dequeue method
    /**  
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeue()
    {
        //declaration of local variables
        int x = 0; 
        T first;
        //sets the first element to first
        first = items[0];
        //for loop that sets the next item to the previous item
        for (int i = 0; i < items.length - 1; i++)
        {
            //sets the next element to the previous element
            items[i] = items[i+1];
        }
        //decrements count
        count -= 1;
        //returns the first element
        return first;
    }
    //first method
    /**  
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first()
    {
        //declaration of local variable
        T result;
        //if statement condition
        if (count == 0)
        {
            //output if the list is empty
            System.out.println("The list is empty");
            //sets the result to null
            result = null;
        }
        //else condition
        else
        {
            //sets the first item to result
            result = items[0];
        }
        //returns the value of the result
        return result;
    }
    //isEmpty method
    /**  
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty()
    {
        //if statement if the count is zero
        if (count == 0)
        {
            //returns true if the count is zero
            return true;
        }
        else
        {
            //returns false if the count is not zero
            return false;
        }
    }
    //size method
    /**  
     * Returns the number of elements in this queue. 
     * @return the integer representation of the size of the queue
     */
    public int size()
    {
        //returns the count
        return count;
    }
    //toString method
    /**  
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString()
    {
        //String builder declaration
        StringBuilder strb = new StringBuilder( );
        //for loop that puts all the elements on different lines
        for(int k = 0; k < count; k++)
        {
            //puts elements on different lines
            strb.append(items[k]).append("\n");
        }
        //returns the string builder string
        return new String(strb);
    }
}

