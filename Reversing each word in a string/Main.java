import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.length();
    String res[]=s.split(" ");
    String t[]=new String[res.length];
    for(int i=0; i<res.length; i++)
    {
      t[i]="";
      for(int j=res[i].length()-1;j>=0;j--)
      {
        t[i]+=res[i].charAt(j);
      }
      System.out.print(t[i]+" ");
    }
    
  }
}