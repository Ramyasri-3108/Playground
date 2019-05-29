import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=1;
      for(int i=1;i<=n;i++)
      {
        for(int sp=1;sp<n-i+1;sp++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
          System.out.print(c+" ");
          c++;
        }
        System.out.println();
      }
    }    
}