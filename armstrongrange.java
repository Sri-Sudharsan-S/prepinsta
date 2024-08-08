//armstrong number range
import java.lang.*;
import java.util.*;
public class armstrongrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(armstrong(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean armstrong(int a)
    {
        int t=a,count=0,sum=0;
        while(t!=0)
        {
            t/=10;
            count++;
        }
        t=a;
        while(t!=0)
        {
            sum=sum+(int)Math.pow(t%10,count);
            t/=10;
        }
        if(a==sum)
        {
            return true;
        }
        return false;
    }
}
