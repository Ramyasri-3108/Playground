import java.util.Scanner;
class Main
{
  public static int fun(int n1)
  {
    return (n1*n1);
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=fun(n);
      System.out.println(x);
	} 
}