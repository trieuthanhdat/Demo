import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;


public class TestQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------QUEUE--------------------");
		Queue<Integer> q = new Queue<Integer>();
		inputQueue(q);
		outputQueue(q);
		sortQueue1(q);
		outputQueue(q);
	}
	
	static void inputQueue(Queue<Integer> k)
	{
		System.out.print("Enter elements separated by space: ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
	          k.enqueue(sc.nextInt());
	    }
               
	}
	
	static void outputQueue(Queue<Integer> Q)
	{
		System.out.println(Q);
	}
	
	public static void reverse(Stack<Integer> S)
	{
		//Reverse the order of elements on stack S using one additional queue
		Queue<Integer> Q = new Queue<Integer>();
                int head;
                for(int i=0;i<S.size();i++)
                {
                    Q.enqueue(S.pop());
                }
                 for(int i=0;i<Q.Size();i++)
                {
                    S.push(Q.dequeue());
                }
	}
	
	public static void sortQueue1(Queue<Integer> Q)
	{
		//Using two additional queue and some non-array variables, order all elements on a queue
		
		
	}
	
	public static void sortQueue2(Queue<Integer> Q)
	{
		//Using one additional queue and some non-array variables, order all elements on a queue
		
		
	}
      
	

}
