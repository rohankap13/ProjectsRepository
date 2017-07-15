
/**
 * This class contains main( ). It is used to test the methods of the ArrayQueue class.
 * 
 * @author Rohan Kapoor
 * @version 5/3/2016
 */
public class Driver
{
    public static void main(String[ ] args)
    {
        //create an instance of the queue specifying the data type in the queue will be Integer. Set the initial capacity of the queue to 5
        ArrayQueue<Integer> myQ = new ArrayQueue<Integer>();
        ArrayQueue<String> myQs = new ArrayQueue<String>();
        //enqueue some data in the queue
        myQ.enqueue(3);
        myQ.enqueue(7);
        myQ.enqueue(6);
        myQ.enqueue(4);
        //Print how many items are in the queue
        System.out.println("The number of elements that have been enqueued is " + myQ.size( ));
        //take a look at what is at the front of the queue
        System.out.println("The element at the front of the queue is " + myQ.first( ) );
        //Now dequeue the front of the queue and print the element after it is removed
        System.out.println("The data  item being dequeued is " + myQ.dequeue( ));
        //now take a look at how many eelements are left in the queue and what the data item at the front of the queue is
        System.out.println("The number of elements now in the queue is " + myQ.size( ));
        System.out.println("The element at the front of the queue is " + myQ.first( ));
        //now print the entire contents of the queue after the data item 3 has been dequeue
        System.out.println(myQ.toString( ));
        myQ.enqueue(8);
        System.out.println("This is the contents of the queue after enqueueing an 8\n" + myQ.toString( ) );
        //to do for you
        //copy all of the code above but create a queue that will hold Strings instead of Integer. Put some String in the queue instead of the ints I enqueued.
      
      
        System.out.println();
        //enqueue some data in the queue
        myQs.enqueue("ITCS");
        myQs.enqueue("MATH");
        myQs.enqueue("CHEM");
        myQs.enqueue("PHYS");
        //Print how many items are in the queue
        System.out.println("The number of elements that have been enqueued is " + myQs.size( ));
        //take a look at what is at the front of the queue
        System.out.println("The element at the front of the queue is " + myQs.first( ) );
        //Now dequeue the front of the queue and print the element after it is removed
        System.out.println("The data  item being dequeued is " + myQs.dequeue( ));
        //now take a look at how many eelements are left in the queue and what the
        //data item at the front of the queue is
        System.out.println("The number of elements now in the queue is " + myQs.size( ));
        System.out.println("The element at the front of the queue is " + myQs.first( ));
        //now print the entire contents of the queue after the data item 3 has
        //been dequeue
        System.out.println(myQs.toString( ));
        myQs.enqueue("UWRT");
        System.out.println("This is the contents of the queue after enqueueing a string 'uwrt'\n" + myQs.toString( ) );
        //to do for you
        //copy all of the code above but create a queue that will hold Strings instead of Integer. Put some String in the queue instead of the ints I enqueued.
        System.out.println();
    }//end of main( )            
 }//end of Driver class