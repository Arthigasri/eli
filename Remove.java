import java.io.*;
import java.util.*;
 public class Remove
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s = sc.nextLine();
    int l = s.length();
    char ch;
    String a="";
    
    for(int i=0; i<l; i++)
    {
      ch = s.charAt(i);
      if(ch!=' ')
      a= a+ ch;
      s = s.replace(ch,' '); 
    }
    
    System.out.println("The String after removing duplicate characters : " + a);
  }
}
