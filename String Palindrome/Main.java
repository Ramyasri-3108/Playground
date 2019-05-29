import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int l=str.length();
      String temp="";
      for(int i=l-1;i>=0;i--)
      {
        temp=temp+str.charAt(i);
      }
      if(str.equals(temp))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}