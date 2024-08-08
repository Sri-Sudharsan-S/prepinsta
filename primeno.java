//prime number
import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the number:");
        int a=s.nextInt();
        boolean isprime=true;
        int i=2;
        isprime=checkprime(a,i);
        String result=isprime?"Prime":"Not Prime";
        System.out.println(result);
    }
    static boolean checkprime(int a,int i)
        {
            if(a==i)
            {
            return true;
            }
            else if(a<2)
            {
                return false;
            }
            else if(a%i==0)
            {
                return false;
            }
            i++;
            return checkprime(a, i); 

        }
}
