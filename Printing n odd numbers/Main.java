import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      for(int i=1;i<2*n;i+=2)
      {
        System.out.println(i);
        c++;
        if(c==n)
        {
          break;
        }
      }
	}
}