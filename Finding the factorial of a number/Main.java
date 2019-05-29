import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=fun(n);
    System.out.println(res);
    
  }
  public static int fun(int n)
  {
    if(n==1||n==0)
      return 1;
    else
      return n*fun(n-1);
  }
}