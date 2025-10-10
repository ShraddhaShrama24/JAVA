//Write a java program to input your total marks in five subjects.Find the percentage and " Grade A" if the percentage greater than or equal to 80, otherwise print"you have a different grade"
import java.util.Scanner;
class MEper
{
    public static void main(String args[])
    {
        int gradeA=80;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage");
        int grade=sc.nextInt();
        System.out.println("Enter percentage of grade A");
        System.out.println("grade:"+grade);
        if (grade>=80);
        System.out.println("GradeA"); 
        System.out.println("You have a different grade");
    }
}
