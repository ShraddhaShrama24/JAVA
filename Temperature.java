import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
      int temp=15;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the temperature");
      int temperature=sc.nextInt();
      System.out.println("Current temperature:"+temperature);
      if(temperature<temp)
      System.out.println("It's cold here");
    }
}
