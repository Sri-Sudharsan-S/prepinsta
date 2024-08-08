//prime number for a given range
import java.util.*;
public class primenorange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(checkprime(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean checkprime(int a)
    {
        if(a<2)
        {
            return false;
        }
        else{
            for(int i=2;i<a/2;i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
