import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=s1.toLowerCase();
      String s3=s2.replaceAll(" ","");
      int l=s3.length();
      int st[]=new int[26];
      for(int i=0;i<26;i++)
      {
        st[i]=0;
      }
      char ch;
      int offset=0;
      for(int i=0;i<l;i++)
      {
        ch=s3.charAt(i);
        offset=ch-'a';
        st[offset]++; 
      }
      for(int i=0;i<26;i++)
      {
        if(st[i]==0)
        {
          char ch1=(char)(i+'a');
          System.out.print(ch1+" ");
        }
          
      }
    }
}