import java.util.Scanner;
class Main
{
  public static int fun(int a[],int n)
  {
    int i,x=0;
    for( i=n;i<n+3;i++)
    {
      x=x+a[i];
    }
    return x;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,f=0,p;
    for( i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int s=a[0]+a[1]+a[2];
    for( i=3;i<n;)
    {
      p=fun(a,i);
      if(p==s)
        f=1;
      i=i+3;
    }
    if(f==1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
       System.out.println("Not a Perfect Batch");
    }
  }
}