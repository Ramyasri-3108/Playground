import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int l=s.length();
    int n=0;
    int isneg=0;
    for(int i=0;i<l;i++)
    {
      if(s.charAt(i)>=48 && s.charAt(i)<=57)
      {
      n=n*10+s.charAt(i)-'0';
      }
    }
    if(s.charAt(0)=='-')
    {
      isneg=1;
    }
    if(isneg==1)
    {
    System.out.println("-"+n);
    }
    else
    {
      System.out.println(n);
    }
    
  }
}