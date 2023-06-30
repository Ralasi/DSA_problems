import java.util.ArrayDeque;
import java.util.Stack;

public class tree_self_pratice 
{
	private Node root;
	
	private static class Node
	{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int v,Node l,Node r)
		{
			value=v;
			left=l;
			right=r;
		}
		
		public Node(int v)
		{
			value=v;
			left=null;
			right=null;
		}
	}
	
	public void tree()
	{
		root=null;
	}
	
	public void createBinaryTree(int arr[])
	{
		root=createBinaryTree(arr,0);
	}
	
	public Node createBinaryTree(int arr[],int start)
	{
		int size=arr.length;
		Node curr=new Node(arr[start]);
		int leftIndex=2*start+1;
		int rightIndex=2*start+2;
		if(leftIndex<size)
			curr.left=createBinaryTree(arr,leftIndex);
		if(rightIndex<size)
			curr.right=createBinaryTree(arr,rightIndex);
		return curr;
	}
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	
	public Node insert(Node node,int value)
	{
		if(node==null)
		{
			node=new Node(value,null,null);
		}
		else
		{
			if(node.value>value)
				node.left=insert(node.left,value);
			else
				node.right=insert(node.right,value);
		}
		return node;
	}
	
	public void printPreOrder()
	{
		printPreOrder(root);
		System.out.println();
	}
	
	public void printPreOrder(Node node)
	{
		if(node!=null)
		{
			System.out.println(node.value+" ");
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}
	
	public void nthPreOrder(int index)
	{
		int counter[]= {0};
		nthPreOrder(root,index,counter);
	}
	
	public void nthPreOrder(Node node,int index,int counter[])
	{
		if(node!=null)
		{
			counter[0]++;
			if(counter[0]==index)
			{
				System.out.println(node.value);
			}
			nthPreOrder(node.left,index,counter);
			nthPreOrder(node.right,index,counter);
		}
	}
	
	public void printInOrder()
	{
		printInOrder(root);
		System.out.println();
	}
	
	public void printInOrder(Node node)
	{
		if(node!=null)
		{
			printInOrder(node.left);
			System.out.println(node.value+" ");
			printInOrder(node.right);
		}
	}
	
	public void nthInOrder(int index)
	{
		int counter[]= {0};
		nthInOrder(root,index,counter);
	}
	
	public void nthInOrder(Node node,int index,int counter[])
	{
		if(node!=null)
		{
			nthInOrder(node.left,index,counter);
			counter[0]++;
			if(counter[0]==index)
			{
				System.out.println(node.value+" ");
			}
			nthInOrder(node.right,index,counter);
		}
	}
	
	public void printPostOrder()
	{
		printPostOrder(root);
		System.out.println();
	}
	
	public void printPostOrder(Node node)
	{
		if(node!=null)
		{
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.println(node.value+" ");
		}
	}
	
	public void nthPostOrder(int index)
	{
		int counter[]= {0};
		nthPostOrder(root,index,counter);
	}
	
	public void nthPostOrder(Node node,int index,int counter[])
	{
		nthPostOrder(node.left,index,counter);
		nthPostOrder(node.right,index,counter);
		counter[0]++;
		if(counter[0]==index)
		{
			System.out.println(node.value+" ");
		}
	}
	
	public void printBreadthFirst()
	{
		ArrayDeque<Node> que=new ArrayDeque<>();
		if(root!=null)
			que.add(root);
		while(que.isEmpty()==false)
		{
			Node temp=que.remove();
			System.out.println(temp.value+" ");
			if(temp.left!=null)
				que.add(temp.left);
			if(temp.right!=null)
				que.add(temp.right);
		}
	}
	
	public void printDepthFirst()
	{
		Stack<Node> stk=new Stack<>();
		if(root!=null)
			stk.push(root);
		while(stk.isEmpty()==false)
		{
			Node temp=stk.pop();
			System.out.println(temp.value+" ");
			if(temp.left!=null)
				stk.push(temp.left);
			if(temp.right!=null)
				stk.push(temp.right);
		}
	}
	
	void printLevelOrderLineByLine()
	{
		ArrayDeque<Node> que1=new ArrayDeque<>();
		ArrayDeque<Node> que2=new ArrayDeque<>();
		Node temp=null;
		if(root!=null)
			que1.add(root);
		while(que1.size()!=0||que2.size()!=0)
		{
			while(que1.size()!=0)
			{
				temp=que1.remove();
				System.out.print(temp.value+" ");
				if(temp.left!=null)
					que2.add(temp.left);
				if(temp.right!=null)
					que2.add(temp.right);
			}
			System.out.println(" ");
			while(que2.size()!=0)
			{
				temp=que2.remove();
				System.out.print(temp.value+" ");
				if(temp.left!=null)
					que1.add(temp.left);
				if(temp.right!=null)
					que1.add(temp.right);
			}
			System.out.println(" ");
		}
	}
	
	void printSpiralTree()
	{
		Stack<Node> stk1=new Stack<>();
		Stack<Node> stk2=new Stack<>();
		Node temp;
		if(root!=null)
			stk1.push(root);
		while(stk1.size()!=0||stk2.size()!=0)
		{
			while(stk1.size()!=0)
			{
				temp=stk1.pop();
				System.out.print(temp.value+" ");
				if(temp.left!=null)
					stk2.push(temp.left);
				if(temp.right!=null)
					stk2.push(temp.right);
			}
			System.out.println(" ");
			while(stk2.size()!=0)
			{
				temp=stk2.pop();
				System.out.print(temp.value+" ");
				if(temp.left!=null)
					stk1.push(temp.left);
				if(temp.right!=null)
					stk2.push(temp.right);
			}
			System.out.println(" ");
		}
	}
	
	public boolean find(int value)
	{
		Node curr=root;
		while(curr!=null)
		{
			if(curr.value==value)
				return true;
			else if(curr.value>value)
				curr=curr.left;
			else
				curr=curr.right;
		}
		return false;
	}
	
	public int findMin()
	{
		Node node=root;
		if(node==null)
			return Integer.MAX_VALUE;
		else if(node.left!=null)
			node=node.left;
		return node.value;
	}
	
	public int findMax()
	{
		Node node=root;
		if(node==null)
			return Integer.MIN_VALUE;
		else if(node.right!=null)
			node=node.right;
		return node.value;
	}
	
	public Node findMinNode(Node curr)
	{
		Node node=curr;
		if(node==null)
			return null;
		else if(node.left!=null)
			node=node.left;
		return node;
	}

	public Node findMaxNode(Node curr)
	{
		Node node=curr;
		if(node==null)
			return null;
		else if(node.right!=null)
			node=node.right;
		return node;
	}
	
	public static void main(String[] args) 
	{
		

	}

}










