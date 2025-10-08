import java.io.*;
import java.util.Scanner;
class WeekDays
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter a day number 1 to 7");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
              {System.out.println("The day is monday");
              break;}
            case 2:
             { System.out.println("The day is tuesday");
              break;}
            case 3:
             { System.out.println("The day is wednesday");
              break;}
            case 4: 
              {System.out.println("The day is thursday");
              break;}        
            case 5:
              {System.out.println("The day is friday");
              break; }
            case 6:
              {System.out.println("The day is saturday");
              break;}
            case 7:
             { System.out.println("The day is sunday");
              break;}
              default:
             { System.out.println("Not an inavid month");
                 break;}
        }
    }
}
