import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
          a[c++]=a[i];
      }
      while(c<n)
        a[c++]=0;
      for(int i=0;i<n;i++)
      {
          System.out.print(a[i]+" ");
      }
    }
}