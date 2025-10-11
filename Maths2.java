//Write a program to print addtion, subtraction,multiplication and division in scanner class.(MARKS 4.5/10)
import java.util.Scanner;
class Maths2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double a,b,add,sub,mul,div;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        add=a+b;
        System.out.println("add="+add);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        sub=a-b;
        System.out.println("sub="+sub);
        System.out.println("Enter the vaue of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        mul=a*b;
        System.out.println("mul="+mul);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        div=a/b;
        System.out.println("div="+div);
        }
}
