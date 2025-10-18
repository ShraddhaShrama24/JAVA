import java.util.Scanner;
class print
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String Name=sc.nextLine();
        int ctr=1;
        System.out.println("Printing 6 times");
        while(ctr<=6)
        {
          System.out.println(Name);
          ctr++;
        }
    }
}
