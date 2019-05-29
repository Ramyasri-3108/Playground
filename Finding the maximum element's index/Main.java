import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int max=0,index=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a[i]>max)
        max=a[i];
    }
    for(int i=0;i<n;i++)
    {
      if(max==a[i])
      {
        index=i;
        break;
      }
    }
    System.out.println(index);
  }
}