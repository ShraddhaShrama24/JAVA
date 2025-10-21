//Write a program to check if there is an integer is read or not.
import java.util.Scanner;
class Six
{
    public static void main(String args[])
    {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        if(sc.hasNextInt())
        {
            value= sc.nextInt();
            System.out.println("you input="+value);
        }   
        
        else  
            System.out.println("Non-integer value entered"); 
    }
}
