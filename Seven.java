import java.util.Scanner;
class Seven
{
    public static void main(String args[])
    {
        int integer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        if(sc.hasNextInt())
        {
            integer=sc.nextInt();
            System.out.println("You input="+integer);
        }
        else
        System.out.println("The integer is non-even");
    }
}
