//Write a program to print the a^4 and a^5 in scanner class.
import java.util.Scanner;
class Work
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a to find a^4 and a^5");
        int b,atothepower4,atothepower5;
        b=sc.nextInt();
        atothepower4=b*b*b*b;
        atothepower5=b*b*b*b*b;
        System.out.println("atothepower4="+atothepower4);
        System.out.println("atothepower5="+atothepower5);
    }
}
