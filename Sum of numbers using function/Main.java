import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int s=0;
    for(int i=1;i<=n;i++)
    {
      s=s+i;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=sum(n);
      System.out.println(x);
	}
}