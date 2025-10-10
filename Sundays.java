//Write a program to find all the sunday in 15 to 30 days.
class Sundays
{
    public static void main(String args[])
    {
        System.out.println("Sundays in a month");
        int i;
        for(i=15;i<30;i++)
        {
            if(i%7==0)
            System.out.println(+i);
        }
    }
}
