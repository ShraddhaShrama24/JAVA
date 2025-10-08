import java.io.*;
import java.util.Scanner;
class Months
{
    public static void main (String args[])throws IOException
    {
        Scanner sc = new Scanner (System.in);
        int ch;
        System.out.println("Enter the month no. 1 to 12");
        ch=sc.nextInt();
        Switch(ch); 
        {
            case1:
              System.out.println("The month is January");
              break;
            case2:
              System.out.println("The month is February");
              break;
            case3:
              System.out.println("The month is March");
              break;
            case4:
              System.out.println("The month is april");
              break;
            case5:
              System.out.println("The month is may");
              break;
            case6:
              System.out.println("The month is june");
              break;
            case7:
              System.out.println("The month is july");
              break;
            case8:
              System.out.println("The month is august");
              break;
            case9:
              System.out.println("The month is september");
              break;
            case10:
              System.out.println("The month is october");
              break;
            case11:
              System.out.println("The month is november");
              break;
            case12:
              System.out.println("The month is december");
              break;
            default:
              System.out.println("Not an invalid day");
        }
    }
}
