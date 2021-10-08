import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Queue<T> {
	LinkedList<T> l =  new LinkedList<T>();
	public void enqueue(T el)
	{
            l.addLast(el);
	}
	
	public T dequeue()
	{
		if(isEmpty()) throw new EmptyStackException();
                        return l.removeFirst();
	}
	
	public boolean isEmpty()
	{
            
		return l.size()==0;
	}
	
	public int Size()
	{
		return l.size().length;
	}
	
	public T front()
	{
            return l.getFirst();
	}
	
	public void clear()
	{
		l.clear();
                
	}
	
	
}

