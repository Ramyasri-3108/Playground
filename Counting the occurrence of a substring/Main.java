import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str1=sc.nextLine();
   // String s2=sc.nextLine();
    int l=str.length();
    int l1=str1.length();
    int c=0,f;
    for(int i=0;i<l;i=i+l1)
    {
      f=0;
     for(int j=0;j<l1;j++)
     {
      if(str1.charAt(j)==str.charAt(i))
        f=1;
     }
      if(f==1)
        c++;
    }
    System.out.println(c);
  } 
}