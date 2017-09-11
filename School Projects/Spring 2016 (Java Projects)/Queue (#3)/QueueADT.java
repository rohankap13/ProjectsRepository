/**
 * QueueADT defines the interface to a queue collection.
 *
 * @version 4/27/2016
 */
public interface QueueADT<T>
{
    //enqueue method
    /**  
     * Adds one element to the rear of this queue. 
     * @param element  the element to be added to the rear of the queue  
     */
    public void enqueue(T element);
    //dequeue method
    /**  
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeue();
    //first method
    /**  
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first();
    //isEmpty method
    /**  
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty();
    //size method
    /**  
     * Returns the number of elements in this queue. 
     * @return the integer representation of the size of the queue
     */
    public int size();
    //toString method
    /**  
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString();
}