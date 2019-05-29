import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String res[]=s.split(" ");
    for(int i=0;i<res.length;i++)
    {
      
      if(res[i]!=null)
      {
      for(int j=i+1;j<res.length;j++)
      {
        if(res[i].equals(res[j]))
        {
          res[j]=null;
        }
      }
       }
    }
    for(int j=0;j<res.length;j++)
    {
      if(res[j]!=null)
      {
      System.out.print(res[j]+" ");
      }
    }
  }
}