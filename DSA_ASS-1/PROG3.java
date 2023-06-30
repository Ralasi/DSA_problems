
public class PROG3 
{

	public static void main(String[] args) 
	{
		 char alpha[] ={'c','a','r','b','o','n'};
		 
		 {
		 for(int i=0;i<alpha.length;i++)
		 {
		 for(int j=0;j<alpha.length;j++)
		 {
		 for(int k=0;k<alpha.length;k++)
		 {
		 for(int l=0;l<alpha.length;l++)
		 {
		 for(int m=0;m<alpha.length;m++)
		 {
		 for(int n=0;n<alpha.length;n++)
		 {
		 if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n 
		 && l!=m && l!=n && m!=n )
		 {
		 System.out.println(alpha[i]+" "+alpha[j]+" "+alpha[k]+" "+alpha[l]+" "+alpha[m]+" "+alpha[n]);

		 
		 }}}}}}}}

	}

}
