import java.lang.*;
import java.util.*;
public class automorphicnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int t=a;
        int x=a*a;
        int count=0;
        while(t!=0)
        {
            t/=10;
            count++;
        }
        int mod=(int)Math.pow(10, count);
        int last=x%mod;
        if(last==a)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
    }
}
