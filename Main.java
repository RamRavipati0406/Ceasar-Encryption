//i am Phani Ram Teja Ravipati
//December 13, 2020

import java.lang.String;
import java.util.*;
import java.util.Scanner;

public class Main
{
  
 public static void main(String[] args)
 {
   Scanner stdIn = new Scanner(System.in);
       
   int num = entering_number(stdIn);
   String message = entering_Message(stdIn);
   message = encrypting_message(message,num);
   System.out.println("The encrypted message: \n"+message);

  }
  
 public static int entering_number(Scanner stdInScanner)
  {
   int number,nu,c=0;
   while(true)
    {
      System.out.println("Enter a number ");
      number = Integer.parseInt(stdInScanner.nextLine());
      
      // i got a little help from a website that i cited in the comment at the submission.
      if(number>0&&number<26)
      {
       break;
      }
      c++;
      if(c>=1)
      System.out.println("ERROR : number should be between 1 and 26 ");
    }
   return number;
  }
  
 public static String entering_Message(Scanner stdIn)
  {
   String message;
   System.out.println("enter the message:");
   message = stdIn.nextLine();
   return message;
  }
    
 public static String encrypting_message(String msg,int num)
 {
   String output = "";
   for(int i = 0;i<msg.length();i++)
   {
      Character ch = msg.charAt(i);
      if(Character.isAlphabetic(ch))
      {
        if(Character.isUpperCase(ch))
       {
          int temp = (int)ch + num;
          if(temp>90)
          {
            temp = temp-26;
          }
          output = output + (char)(temp);
        }
        else if(Character.isLowerCase(ch))
        {
         int temp = (int)ch + num;
         if(temp>122)
         {
           temp = temp-26;
         }
         output = output + (char)(temp);
        }
      }
     else if (!(Character.isLowerCase(ch)&&Character.isUpperCase(ch)))
      {
       output = output + ch;
      }
       
    }
   return output;
  }
}