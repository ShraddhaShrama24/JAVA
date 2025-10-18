//1.Write a program to div;mul;add;sub in scanner class.
//2.Write a program to print 30 to 1 on do while.
import java.util.Scanner;
class one 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b,add,sub,mul,div;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        add=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        System.out.println("add="+add);
        System.out.println("sub="+sub);
        System.out.println("mul="+mul);
        System.out.println("div="+div);
    }
}
