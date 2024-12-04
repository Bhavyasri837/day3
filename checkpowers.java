public class checkpowers {
    public static void main(String args[])
    {
        int n=6;
        if((n&(n-1))==0)
        {
            System.out.println("yes it is power of 2");
        }
        else
        {
            System.out.println("no the given number is not a power of 2");
        }
    }
}
 