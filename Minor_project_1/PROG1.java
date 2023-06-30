import java.util.*;
public class PROG1
{

	public static void main(String[] args)
	{
		String show1="";
		String show2 = new String();
		int lr=0;
		String a;
		// inputting a large number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a large number: ");
		a = sc.next();
		show2 = a;	// Storing input value in a temporary string 
		
		sc.close();
		// Processing unique digits from input value
		int n = a.length();
		char c;
		for (int i = 0; i < n; i++)
		{
			
			c = a.charAt(i);
			String new_data = "";
			
			for (int k = 0; k <= i; k++)
			{
				new_data += a.charAt(k);
			}
			for (int j = i + 1; j < n; j++) 
			{
				if (c == a.charAt(j) && a.charAt(j) != '*') 
				{
					new_data += '*';
				} else {
					new_data += a.charAt(j);
				}
			}
			a = new_data;
						
		}
				
		a = a.replace("*", "");
		
		System.out.println();
		String grammer=(a.length()==1)?"is":"are"; 
		
		// Storing unique digits in a string
		
		for (int i = 0; i < a.length(); i++) {
			if (i==a.length()-1) {
				show1 += a.charAt(i)+".";
				break;
			}
			show1 += a.charAt(i)+",";
		}
		  
		// finding largest number possible from unique digits
		String lrg = "";
		int l = a.length();
		for (int j = 0; j < l; j++) {
			int max = 0;
			for (int i = 0; i < l; i++) {
				if (a.charAt(i) != '#') {
					if (max < Integer.parseInt("" + a.charAt(i))) {
						max = Integer.parseInt("" + a.charAt(i));
					}
				}
			}
			lrg += max;
			a = a.replace("" + max, "#");
			lr = Integer.parseInt(lrg);// converting the (lrg) string into a number
			System.out.println((j + 1) + " iterartion lrg: " + lr + " str: " + a);
		}
		// Output
		System.out.println();
		System.out.println("The unique digits present in "+show2+" "+ grammer +" "+ show1);
		System.out.println("The largest number possible out of these unique digit is "+ lr );
		
	
	

	}

}

