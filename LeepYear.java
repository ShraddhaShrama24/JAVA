//Write a program to find all the leep years b/w 2000 and 2040
class LeepYear
{
    public static void main(String args[])
    {
        System.out.println("Leep year between 2000 and 2040");
        int i;
        for(i=2000;i<2040;i++)
        {
            if(i%4==0)
            System.out.println(+i);
        }
    }
}
