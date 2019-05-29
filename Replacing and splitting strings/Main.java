import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
       String str2=sc.nextLine();
      String str3=str1.replace(str1,str2);
      String s[]=str3.split(" ");
      for(int i=0;i<s.length;i++)
      {
        System.out.println(s[i]);
      }
      
    }
}