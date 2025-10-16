import java.util.Scanner;
class DOwhile
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int digit=1;
        System.out.println("The numbers are");
        do
        {
            System.out.println(digit+"");
            digit++;
        }   while(digit<=10);
    }
}
