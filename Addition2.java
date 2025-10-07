import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,Add;
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        Add = a+b;
        System.out.println("Add="+Add);
    }
}
