import java.util.*;
public class multiplesof4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&3)==0)
        {
            System.out.println("yes given number is multiole of 4");
        }
        else
        {
            System.out.println("no the given number is not a multiple of 4");
        }
    }
    
}