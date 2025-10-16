//Write a program to print a digit 15 to 1 in for loop ;do while loop;while loop in scanner class.
import java.util.Scanner;
class HomeWork
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int digit=15;
      System.out.println("The numbers are");
      do
      {
          System.out.println(digit+"");
        digit--;
    } while(digit>=1);
    }
}
