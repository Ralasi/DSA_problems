import java.util.Arrays;
import java.util.HashMap;
public class try_self 
{
	private static class Node
	{
		private int value;
		private Node next;
		public Node(int v,Node n)
		{
			value=v;
			next=n;
		}
	}
	
	private static Node head;
	private int size=0;
	
	public void addHead(int value)
	{
		head=new Node(value,head);
		size++;
	}
	
	public void addTail(int value)
	{
		Node newNode=new Node(value,null);
		Node curr=head;
		if(head==null)
		{
			head=newNode;
		}
		while(curr!=null)
		{
			curr=curr.next;
		}
		curr.next=newNode;
		size++;
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		try_self ll=new try_self();
		ll.addHead(1);
		ll.addTail(4);
		ll.addTail(6);
		ll.print();
		
	}

}
