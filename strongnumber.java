import java.util.*;
public class strongnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int t=a;
        int sum=0;
        while(t!=0)
        {
            int digit=t%10;
            sum=sum+fact(digit);
            t=t/10;
        }
        if(sum==a)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not A Strong Number");
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
