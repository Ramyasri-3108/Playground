import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<r;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<r;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    int c1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<r;j++)
      {
        c1[i][j]=a[i][j]-b[i][j];
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(c1[i][j]+" ");
      }
      System.out.println();
    }
  }
}