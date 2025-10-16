import java.util.Scanner;
class While
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("number");
        String number=sc.nextLine();
        int ctr=1;
        System.out.println("printing 4 times");
        while(ctr<=4)
        {
          System.out.println(number);
          ctr++;
        }
    }
}
