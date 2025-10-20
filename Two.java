import java.util.Scanner;
class two
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number=30;
        System.out.println("The numbers are");
        do
        {
            System.out.println(number+"");
            number--;
        }  while(number>=1);
    }
}
