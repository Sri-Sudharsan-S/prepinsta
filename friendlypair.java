import java.util.*;
public class friendlypair {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int sum1=sumfactors(a);
        int sum2=sumfactors(b);
        if((float)sum1/a==(float)sum2/b)
        {
            System.out.println("Friendly Pair");
        }
        else{
            System.out.println("Not Friendly Pair");
        }
    }    
    static int sumfactors(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
