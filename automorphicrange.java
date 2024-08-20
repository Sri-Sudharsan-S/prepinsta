import java.lang.*;
import java.util.*;
public class automorphicrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            int t=i;
            int x=i*i;
            int count=0;
            while(t!=0)
            {
                t/=10;
                count++;
            }
            int mod=(int)Math.pow(10,count);
            int last=x%mod;
            if(last==i)
            {
                System.out.print(i+" ");
            }
        }
    }    
}
