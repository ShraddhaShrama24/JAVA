//Write a java program to enter your name and print it 5 times using while loop.
import java.util.Scanner;
class Yourname
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       String Name=sc.nextLine();
       int ctr = 1; //i or ctr
       System.out.println("Printing 5 times");
       while (ctr<=5)
       {
          System.out.println(Name);
          ctr++;
       }
   }
}
