import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String t=sc.nextLine();
      String s1=s+s;
      if(s1.contains(t))
        System.out.println("Yes");
      else
        System.out.println("No");   
    }
}