import java.util.*;
public class squares {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=x%10;
        int n=x/10;
        System.out.println("the maximum number of squares are \n"+((n/k)*(n/k)));
    }
    
}
