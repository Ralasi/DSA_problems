import java.util.*;

public class reversing_queue_using_stack 
{
    static Queue<Integer> queue;
    
    static void print()
    {
    	while(!queue.isEmpty())
    	{
    		System.out.print(queue.peek()+" ");
    		queue.remove();
    	}
    }
    
    static void reverseQue()
    {
    	Stack<Integer> stack=new Stack<>();
    	while(!queue.isEmpty())
    	{
    		stack.add(queue.peek());
    		queue.remove();
    	}
    	while(!stack.isEmpty())
    	{
    		queue.add(stack.peek());
    		stack.pop();
    	}
    }

	public static void main(String[] args) 
	{
		queue=new LinkedList<>();
		queue.add(8);
		queue.add(4);
		queue.add(0);
		queue.add(6);
		queue.add(1);
		reverseQue();
		print();
	}

}
