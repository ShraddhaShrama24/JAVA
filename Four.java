//Write a program to calcualate volume of a rectangle.
import java.util.Scanner;
class Four
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,mul;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        System.out.println("Enter the value of c");
        c=sc.nextInt();
        mul=a*b*c;
        System.out.println("mul="+mul);
    }
}
