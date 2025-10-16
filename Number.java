import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number=10;
        System.out.println("The number are");
        do
        {
          System.out.println(number+"");
          number--;
        }while(number>=1);
    }
}
