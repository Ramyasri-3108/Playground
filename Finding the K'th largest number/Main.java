import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      Arrays.sort(a);
      
      for(int i=1;i<=n;i++)
      {
        if(i==n-k)
        {
          System.out.println(a[i]);
          break;
        } 
      }
    }   
}