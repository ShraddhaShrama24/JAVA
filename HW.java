//Write a program and print your whole family name in while loop.
import java.util.Scanner;
class hw
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Family name");
        String Name=sc.nextLine();
        int ctr=1;
        System.out.println("Printing 5 times");
        while(ctr<=5)
        {
            System.out.println(Name);
            ctr++;
        }
    }
}
