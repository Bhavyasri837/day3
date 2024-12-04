import java.util.*;
public class studentmarks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        String s="ram";
        boolean p=(s1>=35)&&(s2>=35)&&(s3>=35)&&(s4>=35)&&(s5>=35);
        double avg=(s1+s2+s3+s4+s5)/5;
        if(avg>=80 && avg<=100 && p)
        {
            String str=String.format("%s your status =PASS and grade=A",s);
            System.out.println(str);
        }
        else if(avg>=60 && avg<=80 && p)
        {
            String str=String.format("%s your status =PASS and grade=B",s);
            System.out.println(str); 
        }
        else if(avg>=60 && avg<=80 && p)
        {
            String str=String.format("%s your status =PASS and grade=C",s);
            System.out.println(str);
        }
        else
        {
            String str=String.format("%s your status =FAIL",s);
            System.out.println(str);
        }
    }
}