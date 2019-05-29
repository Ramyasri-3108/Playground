import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String p=sc.nextLine();
      String q=sc.nextLine();
      String str=s.replaceAll(p,q);
      System.out.println(str);
    }
}