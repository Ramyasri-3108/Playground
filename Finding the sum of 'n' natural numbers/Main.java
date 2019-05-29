import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=fun(n);
      System.out.println(res);
    }
    public static int fun(int n)
    {
      if(n==0)
        return 0;
      else
        return n+fun(n-1);
    }
}