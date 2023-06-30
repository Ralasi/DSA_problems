import java.util.*;

public class stack_using_queue 
{
	Queue<Integer> q=new LinkedList<Integer>();
	
	boolean isEmpty()
	{
		return q.isEmpty();
	}
	
	void push(int val)
	{
		int size=q.size();
		q.add(val);
		for(int i=0;i<size;i++)
		{
			int x=q.remove();
			q.add(x);
		}
	}
	
	int pop()
	{
		if(q.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int x=q.remove();
		return x;
	}
	
	int top()
	{
		if(q.isEmpty())
			return -1;
		return q.peek();
	}
	
	
	public static void main(String[] args) 
	{
		stack_using_queue sq=new stack_using_queue();
		sq.push(5);
		sq.push(10);
		sq.push(20);
		System.out.println("Top element :" + sq.top());
		sq.pop();
		sq.push(30);
		sq.pop();
		System.out.println("Top element :" + sq.top());
		

	}

}
