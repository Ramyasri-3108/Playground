import java.util.Scanner;
import java.lang.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      int x=n;
      int y=n;
      while(n>0)
      {
        n=n/10;
        c++;
      }
  int r,s=0;
  while(x>0)
    {
      r=x%10;
      s=s+(int)Math.pow(r, c);
      x=x/10;
    }
  if(s==y)
  {
    System.out.println("Armstrong Number");
  }
   else
   {
    System.out.println("Not a Armstrong Number"); 
   }
     
}
}