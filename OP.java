//Write a program to calculate the square and cube of a number. Use comma to put more than 1 expression on the line .
import java.util.Scanner;
class op
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find square and cube");
        int a,mul,cube;
        a=sc.nextInt();
        mul=a*a;
        cube=a*a*a;
        System.out.println("mul="+mul);
        System.out.println("cube="+cube);
    }
}
