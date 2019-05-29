 
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=2;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i%2!=0&&j==n)
            System.out.print(k++);
          else if(i%2==0&&j==1)
            System.out.print(k++);
         else
            System.out.print(i);
        }
        System.out.println();
      }
	}
}