import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n,r,s=0;
      while(n!=0)
      {
        r=n%10;
        s=s+fact(r);
        n=n/10;
      }
      if(s==x)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
   public static int fact(int k)
      {
        int f=1;
        for(int i=1;i<=k;i++)
        {
          f=f*i;
        }
        return f;
      }
}