
public class Linked_list
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
			head=newNode;
		while(curr.next!=null)
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
	
	public void sortedInsert(int value)
	{
		Node newNode=new Node(value,null);
		Node curr=head;
		if(curr==null && curr.value>value)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		while(curr.next!=null && curr.next.value<value)
		{
			curr=curr.next;
		}
		curr.next=newNode.next;
		curr.next=newNode;
	}
	
	public boolean searchList(int data)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.value==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	public static void deleteHead()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=null;
		if(head.next==null)
			head=null;
		else
		{
			head=head.next;
			temp.next=null;
		}
		System.out.println("Deleted node is: "+temp.value);
	}
	
	public static void deleteTail()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=null;
		if(head.next==null)
			head=null;
		else
		{
			Node prev=null;
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
		}
		System.out.println("Deleted node is :"+temp.value);
	}
	
	public static void deleteAtAnyPosition(int key)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(head.value==key)
		{
			deleteHead();
		}
		else
		{
			Node prev=null;
			Node temp=head;
			while(temp!=null && temp.value!=key)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp==null)
				System.out.println("\nNot present");
			else
			{
				prev.next=temp.next;
				temp.next=null;
				System.out.println("\nDeleted node is: "+temp.value);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Linked_list ll=new Linked_list();
		ll.addHead(5);
		ll.addTail(9);
		ll.addTail(6);
		ll.addTail(2);
		ll.addTail(1);
		ll.print();
//		ll.sortedInsert(4);
//		ll.print();
		ll.deleteAtAnyPosition(9);
		ll.print();
		

	}

}
