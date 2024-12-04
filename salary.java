import java.util.*;
public class salary 
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int pp=sc.nextInt();
    int yoe=sc.nextInt();
    int salary=sc.nextInt();
if(pp>=5 && yoe>=10 && salary>=50000)
{
System.out.println("incrementing salary by 10 percent:"+(salary+(salary/100)*10));
}
else if(pp>=3 && pp<5 && yoe>=5 && yoe<10 &&salary>=30000 && salary<50000)
{
System.out.println("incrementing salary by 8 percent:"+(salary+(salary/100)*8));
}
else if(pp>=1 && pp<3 && yoe>=1 && yoe<5 && salary>=15000 && salary<30000)
{
System.out.println("incrementing salary by 6 percent:"+(salary+(salary/100)*6));
}
else
{
    System.out.println("you are not eligible for increment");
}

}
    
}
