
import java.util.Scanner;

public class strongnumberrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Range");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            int t=i,sum=0;
            while(t!=0)
            {
                int digit=t%10;
                sum=sum+fact(digit);
                t=t/10;
            }
            if(sum==i)
        {
            System.out.println(i);
        }
        }
    }
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
