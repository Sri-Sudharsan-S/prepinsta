//reverse a number
import java.util.*;
public class reversenumber {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        int rev=0;
        while(a!=0)
        {
            rev=rev*10+a%10;
            a/=10;
        }
        System.out.println(rev);
    }
}
