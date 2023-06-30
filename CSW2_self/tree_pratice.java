import org.w3c.dom.Node;

public class tree_pratice
{
	private static Node root;
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
		
		public void tree_pratice()
		{
			root=null;
		}
	}
	

	public static void main(String[] args) 
	{
		

	}

}
