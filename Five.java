//Write a program to input 2 no. and find the sum using numeric method of scanner class.
import java.util.Scanner;
class Five
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("sum="+sum);
    }
}
