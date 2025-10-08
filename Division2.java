import java.util.Scanner;
class DIVIDE
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       double a,b,div;
       System.out.println("Enter the value of a");
       a=sc.nextDouble();
       System.out.println("Enter the value of b");
       b=sc.nextDouble();
       div=a/b;
       System.out.println("div="+div);
    }
}
