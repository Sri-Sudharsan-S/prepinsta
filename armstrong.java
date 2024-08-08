//armstrong
import java.util.*;

public class armstrong {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int count=0,num=0;
        int t=a;
        while(t!=0)
        {
            t/=10;
            count++;
        }
        t=a;
        while(t!=0)
        {
            num=num+(int)Math.pow(t%10, count);
            t/=10;
        }
        if(num==a)
        {
            System.out.println("Armstrong");
        }
        else{
            System.err.println("Not Armstrong");
        }
    }
}
