import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k;
      for(int i=n;i>=1;i--)
      {
        k=i;
        for(int j=1;j<=i;j++)
        {
          System.out.print(k);
          k--;
        }
        System.out.println();
      }
	}
}