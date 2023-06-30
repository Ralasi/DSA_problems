import java.util.Stack;

public class stack_problems 
{
	public static void sortedInsert(Stack<Integer> stk,int element)
	{
		if(stk.isEmpty()||element>stk.peek())
		{
			stk.push(element);
		}
		else
		{
			int t=stk.pop();
			sortedInsert(stk,element);
			stk.push(t);
		}
	}
	
	public static void sortStack(Stack<Integer> stk)
	{
		if(stk.isEmpty()==false)
		{
			int t=stk.pop();
			sortStack(stk);
			stk.push(t);
		}
	}
	
	public static void bottomInsert(Stack<Integer> stk,int element)
	{
		if(stk.isEmpty())
			stk.push(element);
		else
		{
			int t=stk.pop();
			bottomInsert(stk,element);
			stk.push(t);
		}
	}
	
	public static void reverse(Stack<Integer> stk)
	{
		if(stk.isEmpty())
			return;
		else
		{
			int t=stk.pop();
			reverse(stk);
//			bottomInsert(stk,element);
		}
	}
	
	public static boolean isBalanceParentesis(String expn)
	{
		Stack<Character> stk=new Stack<Character>();
		for(char ch: expn.toCharArray())
		{
			switch(ch)
			{
			case'{':
			case'[':
			case'(':
				stk.push(ch);
				break;
			case'}':
				if(stk.pop()!='{')
				{
					return false;
				}
				break;
			case']':
				if(stk.peek()!='[')
				{
					return false;
				}
				break;
			case')':
				if(stk.pop()!='(')
				{
					return false;
				}
				break;
			}
		}
		return stk.isEmpty();
	}
	
	public static int maxDepthParenthesis(String expn,int size)
	{
		Stack<Character> stk=new Stack<Character>();
		int depth=0;
		int maxDepth=0;
		char ch;
		for(int i=0;i<size;i++)
		{
			ch=expn.charAt(i);
			if(ch=='(')
			{
				stk.push(ch);
				depth++;
			}
			else if(ch==')')
			{
				stk.pop();
				depth--;
			}
			if(depth>maxDepth)
			{
				maxDepth=depth;
			}
		}
		return maxDepth;
	}
	
	public static int longestContBalParen(String expn,int size)
	{
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(-1);
		int length = 0;
		for(int i=0;i<size;i++)
		{
			if(expn.charAt(i)=='(')
			{
				stk.push(i);
			}
			else
			{
				stk.pop();
				if(stk.size()!=0)
					length=Math.max(length, i-stk.peek());
				else
					stk.push(i);
			}
		}
		return length;
	}
	
	
	public static boolean findDuplicateParenthesis(String expn,int size)
	{
		Stack<Character> stk=new Stack<Character>();
		char ch;
		int count;
		for(int i=0;i<size;i++)
		{
			ch=expn.charAt(i);
			if(ch==')')
			{
				count=0;
				while(stk.size()!=0 && stk.peek()!='(')
				{
					stk.pop();
					count++;
				}
				if(count<=1)
					return true;
				else
					stk.push(ch);
			}
		}
		return false;
	}
	
	public static void printParentesisNumber(String expn,int size)
	{
		Stack<Integer> stk=new Stack<Integer>();
		String output=new String();
		char ch;
		int count=1;
		for(int i=0;i<size;i++)
		{
			ch=expn.charAt(i);
			if(ch=='(')
			{
				stk.push(count);
				output+=count;
				count++;
			}
			else if(ch==')')
			{
				output+=stk.pop();
			}
		}
	}
	

	
	public static void main(String[] args) 
	{
//		String expn= "{()}()[{()}]";
//		boolean value=isBalanceParentesis(expn);
//		System.out.println("Given expression: "+expn);
//		System.out.println(value);
		
//		String expn="((((A)))((((BBB()))))()()()())";
//		int size=expn.length();
//		int value=maxDepthParenthesis(expn,size);
//		System.out.println(value);
		
		//		String expn="())((()))(())()(()";
		//		int size=expn.length();
		//		int value=longestContBalParen(expn,size);
		//		System.out.println("value: "+value);
		
//		String expn = "(((a+b))+c)";
//		 System.out.println("Given expn : " + expn);
//		 int size = expn.length();
//		 boolean value = findDuplicateParenthesis(expn, size);
//		 System.out.println("Duplicate Found : " + value);
		
		String expn1 = "(((a+(b))+(c+d)))";
		 int size = expn1.length();
		 System.out.println("Given expn " + expn1);
		 printParentesisNumber(expn1, size);


	}

}
