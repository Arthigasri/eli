import java.io.*;
import java.util.*;
 public class Palindromenumber 
{
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a;
    System.out.println(" Enter a number : ");
    a =sc.nextInt();   
    int reverse=0,temp=0;
    while (a> 0) 
    {
      int b=a%10;
      temp = temp + b;
      a=a/ 10;
    }            
    System.out.println("The sum of given number" + temp);
    while (temp>0) 
    {
      int remainder = temp% 10;
      reverse = reverse * 10 + remainder;
      temp=temp/ 10;
    }            
    System.out.println(reverse);
    if(reverse==temp)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.print("Not palindrame");
    }
  }
}
