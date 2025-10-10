import java.util.Scanner;
class garde
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        int TMark = sc.nextInt();
        float MyPer=TMark/5;
        System.out.println("Percentage is:"+MyPer);
        if(MyPer>=80)
        System.out.println("GradeA");
        else
        System.out.println("You have a different grade");
    }
}
