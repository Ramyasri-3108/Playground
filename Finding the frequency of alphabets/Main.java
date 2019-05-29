import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=s1.toLowerCase();
      int st[]=new int[26];
      for(int i=0;i<26;i++)
        st[i]=0;
      int offset=0;
      for(int i=0;i<s2.length();i++)
      {
        char ch=s2.charAt(i);
        offset=ch-'a';
        st[offset]++;
      }
      for(int i=0;i<s2.length();i++)
      {
        if(st[s2.charAt(i)-'a']!=0)
        {
          System.out.print(s2.charAt(i));
           System.out.print(st[s2.charAt(i)-'a']+" ");
          st[s2.charAt(i)-'a']=0;
        }
      }
    }
}