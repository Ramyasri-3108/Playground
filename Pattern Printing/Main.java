import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int k=1;
      int n=r;
      for(int i=r;i>=1;i--)
      {
        for(int j=r;j>=i;j--)
        {
          System.out.print(j); 
        }
        for(int j=i;j>1;j--)
        {
          System.out.print(i);
        }
        System.out.println();
        }
      
    }
}