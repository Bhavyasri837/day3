public class checkpowerof4 
{
public static void main(String args[])
    {
        int n=65;
        if((n&(n-2))==0)
        {
            System.out.println("yes it is power of 4");
        }
        else
        {
            System.out.println("no the given number is not a power of 4");
        }
    }
}