import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      int hash[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        hash[a[i]]++;
      }
      for(int i=1;i<=k;i++)
      {
        System.out.print(i+" "+hash[i]);
        System.out.println();
      }
    }
}